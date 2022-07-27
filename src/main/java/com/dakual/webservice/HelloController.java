package com.dakual.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private IResponseService responseService;

    @RequestMapping("/")
    public ResponseEntity<Response> hello() {
        Response response = responseService.getResponse();
        return ResponseEntity.ok(response);
    }

}