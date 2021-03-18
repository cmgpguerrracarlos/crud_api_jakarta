package com.cmgp.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hola")
public class HelloService {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello(){
        return "Hola Pibe!!!!";
    }
    
}
