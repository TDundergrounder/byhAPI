package com.beyondh.client;

import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

import java.net.URI;

public class HttpDeleteRequest extends HttpEntityEnclosingRequestBase {
    private static final  String METHOD_NAME = "DELETE";

    public String getMethod()
    {
        return METHOD_NAME;
    }

    public HttpDeleteRequest(final String uri)
    {
        super();
        setURI(URI.create(uri));
    }

    public HttpDeleteRequest(final URI  uri)
    {
        super();
        setURI(uri);
    }

    public HttpDeleteRequest() {
    }
}
