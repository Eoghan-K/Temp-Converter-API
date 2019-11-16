/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.temperature;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/hello")
/**
 *
 * @author eogha
 */
public class Tester {

    @GET
    @Path("/{param}")
    public Response sayHelloWorldPath(@PathParam("param") String message) {
        String output = "Hello " + message + "!";
        return Response.status(200).entity(output).build();
    }
    
    @GET
    public Response sayHelloWorldQuery(@QueryParam("name") String nameVal, @QueryParam("age") int ageVal) {
        String output = "Hello " + nameVal + " Age = " + ageVal;
        return Response.status(200).entity(output).build();
    }
}
