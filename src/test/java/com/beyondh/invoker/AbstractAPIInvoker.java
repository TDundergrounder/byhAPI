package com.beyondh.invoker;

import com.beyondh.client.APIClient;
import com.beyondh.client.APIClientsFactory;
import com.beyondh.client.APIRequest;
import com.beyondh.client.APIResult;
import com.beyondh.constants.HttpConstants;
import com.beyondh.enums.HttpMethod;
import com.beyondh.model.order.CheckinInfo;
import com.beyondh.utility.ClientGroup;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public abstract class AbstractAPIInvoker {
    protected  String _route;


    protected APIClientsFactory _clientFactory;

    @Autowired
    protected AbstractAPIInvoker(APIClientsFactory _clientFactory){
        this._clientFactory = _clientFactory;
    }

    protected  AbstractAPIInvoker(String route) {
         super();

         this._route = route;
    }

    protected APIResult post(String method,Object parameters)
    {
        return post(method,parameters,null);
    }

    protected APIResult post(String method,Object parameters,String clientName) {
        return sendRequest(method,parameters,HttpMethod.POST,clientName);
    }

    /*
    protected APIResult get(String method,Object parameters)
    {
        return get(method,parameters,null);
    }

    protected APIResult get(String method,Object parameters,String clientName) {
        return sendRequest(method,parameters,HttpMethod.GET,clientName);
    }


    protected APIResult put(String method,Object parameters)
    {
        return put(method,parameters,null);
    }

    protected APIResult put(String method,Object parameters,String clientName) {
        return sendRequest(method,parameters,HttpMethod.PUT,clientName);
    }

    protected  APIResult delete(String method,Object parameters)
    {
        return delete(method,parameters,null);
    }

    protected APIResult delete(String method,Object parameters,String clientName) {
        return sendRequest(method,parameters,HttpMethod.DELETE,clientName);
    }
    */

    private APIResult sendRequest(String method, Object parameters, HttpMethod httpMethod,String clientName)
    {
        if (null == clientName) {
           clientName = GetCallingGroup();

           if(null == clientName) {
               return new APIResult(HttpConstants.RESULT_CODE_CLIENT_FETCH_ERROR, null, "No group available");
           }
        }

        APIClient client = _clientFactory.getClient(clientName);
        if (null == client) {
            return new APIResult(HttpConstants.RESULT_CODE_CLIENT_FETCH_ERROR, null, "No client available");
        }

        String parameterString = null == parameters? "" : new Gson().toJson(parameters);
        APIRequest request = new APIRequest(String.format("%s.%s", _route, method),parameterString);
        switch (httpMethod)
        {
            /*
            case PUT:
                return client.put(request);
            case DELETE:
                return client.delete(request);
            case GET:
                return client.get(request);
                */
            case POST:
            default:
                return client.post(request);
        }
    }

    private String GetCallingGroup() {
        Class<?> classWithGroup = Arrays.stream(Thread.currentThread().getStackTrace())
                .map((stack) -> stack.getClassName())
                .distinct()
                .map((className) ->{
                         try{
                             return Class.forName(className);
                         }
                         catch(Exception e){
                             return null;
                         }})
                .filter((classType) ->{
                            if(null ==classType)
                                return false;

                            if(!classType.isAnnotationPresent(ClientGroup.class))
                                return false;

                            return Arrays.stream(classType.getAnnotationsByType(ClientGroup.class)).anyMatch(annotation-> isWithGroupTestAnnotation(annotation));
                        })
                 .findFirst()
                 .orElse(null);

        if(null == classWithGroup)
            return null;


        String clientGroup  = Arrays.stream(classWithGroup.getAnnotationsByType(ClientGroup.class))
                .filter((annotation)-> isWithGroupTestAnnotation(annotation))
                .findFirst()
                .get()
                .value();

       return clientGroup;
    }

    private boolean isWithGroupTestAnnotation(Annotation annotation)
    {
        String clientGroup = ((ClientGroup) annotation).value();

        return  clientGroup != null && !clientGroup.isEmpty();
    }
}
