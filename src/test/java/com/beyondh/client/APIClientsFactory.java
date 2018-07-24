package com.beyondh.client;

import com.beyondh.constants.SpringConstants;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Hashtable;

@Component
@Scope(SpringConstants.SCOPE_SINGLETON)
public class APIClientsFactory {

    public APIClientsFactory()
    {
        _clients = new Hashtable<String,APIClient>();
    }

    private Hashtable<String,APIClient> _clients;

    public APIClient getClient(String name)
    {
        if(!_clients.containsKey(name)) {
            _clients.put(name, new APIClient(name));
        }

        return _clients.get(name);
    }

    public void clean()
    {
        if(_clients.isEmpty())
            return;

        _clients.forEach((name,client)->client.close());
        _clients.clear();
    }

}
