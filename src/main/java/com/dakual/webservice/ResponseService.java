package com.dakual.webservice;

import org.springframework.stereotype.Service;

@Service
public class ResponseService implements IResponseService {

    @Override
    public Response getResponse() {
        return new Response("Hello Java! Spring Boot Demo!");
    }

}
