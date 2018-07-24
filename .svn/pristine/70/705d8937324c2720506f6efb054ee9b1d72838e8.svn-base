package com.beyondh.client;

import com.beyondh.config.TestConfiguration;
import com.beyondh.constants.HttpConstants;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.http.HttpHost;
import org.apache.http.client.methods.*;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.TrustStrategy;
import org.apache.http.util.EntityUtils;
import javax.net.ssl.*;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class APIClient extends HttpClientBuilder {

    private CloseableHttpClient _client;

    private String  _name;

    public APIClient(String name)
    {
        super();

        _name = name;

        try {
            setSSLSocketFactory(createSSLConnSocketFactory());
            _client = build();
        }
        catch (Exception e)
        {

        }
    }

    public void close()
    {
        try {
            _client.close();;
        }
        catch (Exception e)
        {
            //do nothing.
        }

    }

    /*
    public APIResult get(APIRequest request) {

        try {
            JsonObject jsonParameter =  new JsonParser().parse(new Gson().toJson(request.getParameters())).getAsJsonObject();
            String parameterString = Helper.toUrlParameter(jsonParameter);
            CloseableHttpResponse response =  _client.execute(null == parameterString ? new HttpGet(String.format("%s%s",TestConfiguration.instance().getUrl(),request.getMethod())):new HttpGet(String.format("%s%s?%s",TestConfiguration.instance().getUrl(),request.getMethod(),parameterString)));
            int httpCode = response.getStatusLine().getStatusCode();
            if( httpCode == HttpConstants.HTTP_SUCCESS_CODE)
            {
                return parseResult(EntityUtils.toString(response.getEntity(),HttpConstants.ENTITY_CONTENT_ENCODE));
            }
        }
        catch (Exception e)
        {
            return new APIResult(HttpConstants.RESULT_CODE_IO_PROTOCOL_ERROR,null,e.getMessage());
        }

        return new APIResult();
    }*/

    public APIResult post(APIRequest request)
    {
        try {
            StringEntity entity = new StringEntity(new Gson().toJson(request),HttpConstants.ENTITY_CONTENT_ENCODE);
            entity.setContentEncoding(HttpConstants.ENTITY_CONTENT_ENCODE);
            entity.setContentType(HttpConstants.ENTITY_CONTENT_TYPE);

            HttpPost httpPost = new HttpPost(String.format("%s",TestConfiguration.instance().getUrl()));
            httpPost.addHeader(HttpConstants.HEADER_DOMAIN,TestConfiguration.instance().getDomain());
            httpPost.setEntity(entity);

            CloseableHttpResponse response =  _client.execute(httpPost);

             //CloseableHttpResponse response =  _client.execute(new HttpHost("127.0.0.1",8888,"https"),httpPost);
            int httpCode = response.getStatusLine().getStatusCode();
            if( httpCode == HttpConstants.HTTP_SUCCESS_CODE)
            {
                return parseResult(EntityUtils.toString(response.getEntity(),HttpConstants.ENTITY_CONTENT_ENCODE));
            }

            return new APIResult(String.valueOf(httpCode),null,"http connection error!");
        }
        catch (Exception e)
        {
            return new APIResult(HttpConstants.RESULT_CODE_IO_PROTOCOL_ERROR,null,e.getMessage());
        }
    }

    /*
    public APIResult put(APIRequest request)
    {
        try {
            StringEntity entity = new StringEntity(new Gson().toJson(request.getParameters()),HttpConstants.ENTITY_CONTENT_ENCODE);
            entity.setContentEncoding(HttpConstants.ENTITY_CONTENT_ENCODE);
            entity.setContentType(HttpConstants.ENTITY_CONTENT_TYPE);

            HttpPut httpPut = new HttpPut(String.format("%s%s",TestConfiguration.instance().getUrl(),request.getMethod()));
            httpPut.setEntity(entity);

            CloseableHttpResponse response =  _client.execute(httpPut);
            int httpCode = response.getStatusLine().getStatusCode();
            if( httpCode == HttpConstants.HTTP_SUCCESS_CODE)
            {
                return parseResult(EntityUtils.toString(response.getEntity(),HttpConstants.ENTITY_CONTENT_ENCODE));
            }

            return new APIResult(String.valueOf(httpCode),null,"http connection error!");
        }
        catch (Exception e)
        {
            return new APIResult(HttpConstants.RESULT_CODE_IO_PROTOCOL_ERROR,null,e.getMessage());
        }
    }

    public APIResult delete(APIRequest request)
    {
        try {
            StringEntity entity = new StringEntity(new Gson().toJson(request.getParameters()),HttpConstants.ENTITY_CONTENT_ENCODE);
            entity.setContentEncoding(HttpConstants.ENTITY_CONTENT_ENCODE);
            entity.setContentType(HttpConstants.ENTITY_CONTENT_TYPE);

            HttpDeleteRequest httpDelete = new HttpDeleteRequest(String.format("%s%s",TestConfiguration.instance().getUrl(),request.getMethod()));
            httpDelete.setEntity(entity);

            CloseableHttpResponse response =  _client.execute(httpDelete);
            int httpCode = response.getStatusLine().getStatusCode();
            if( httpCode == HttpConstants.HTTP_SUCCESS_CODE)
            {
                return parseResult(EntityUtils.toString(response.getEntity(),HttpConstants.ENTITY_CONTENT_ENCODE));
            }

            return new APIResult(String.valueOf(httpCode),null,"http connection error!");
        }
        catch (Exception e)
        {
            return new APIResult(HttpConstants.RESULT_CODE_IO_PROTOCOL_ERROR,null,e.getMessage());
        }
    }
   */

    private APIResult parseResult(String resultString)
    {
        APIResult result = new APIResult();

        JsonObject jsonParameter =  new JsonParser().parse(resultString).getAsJsonObject();
        result.setCode(jsonParameter.get(HttpConstants.RESULT_CODE_INDEX_STRING).toString());
        result.setMessage(jsonParameter.get(HttpConstants.RESULT_MESSAGE_INDEX_STRING).toString());
        result.setContent(jsonParameter.get(HttpConstants.RESULT_DATA_INDEX_STRING).toString());
        result.setSubCode(jsonParameter.get(HttpConstants.RESULT_SUBCODE_INDEX_STRING).toString());
        result.setSubMessage(jsonParameter.get(HttpConstants.RESULT_SUBMESSAGE_INDEX_STRING).toString());

        return result;
    }

    private  SSLConnectionSocketFactory createSSLConnSocketFactory() {

        SSLConnectionSocketFactory sslsf = null;
        try {

            SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy()
            {
                public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException
                {
                    return true;
                }
            }).build();

            sslsf = new SSLConnectionSocketFactory(sslContext, new X509HostnameVerifier() {
                @Override
                public boolean verify(String arg0, SSLSession arg1) {
                    return true;
                }

                @Override
                public void verify(String host, SSLSocket ssl) throws IOException {
                }

                @Override
                public void verify(String host, X509Certificate cert) throws SSLException {
                }

                @Override
                public void verify(String host, String[] cns, String[] subjectAlts) throws SSLException {
                }
            });
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
        return sslsf;
    }
}
