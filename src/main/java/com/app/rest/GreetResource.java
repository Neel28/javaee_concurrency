package com.app.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("greetUser_1")
public class GreetResource {

    @GET
    public String greetUser(){
        return "Java EE concurrency starts!!";
    }
}
