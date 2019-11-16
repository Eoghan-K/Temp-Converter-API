/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.temperature;

import javax.ws.rs.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author eogha
 */

@Path("/converter")
public class Temperature {

    @GET
    @Path("/celsius/{param}")
    public Response convertToFahrenheit(@PathParam("param") int temp){
        String output = temp + "C is " +  String.valueOf(temp * 9 / 5 + 32) + "F";
        return Response.status(200).entity(output).build();
    }
    
    @GET
    @Path("/fahrenheit/{param}")
    public Response convertToCelsius(@QueryParam("param") int temp){
        String output = temp + "F is " +  String.valueOf((temp - 32) * 5 / 9) + "C";
        return Response.status(200).entity(output).build();
    }
    
    @GET
    @Path("/celsius")
    public Response convertToCelsiusQuery(@QueryParam("param") int temp){
        String output = temp + "F is " +  String.valueOf((temp - 32) * 5 / 9) + "C";
        return Response.status(200).entity(output).build();
    }
    
    @GET
    @Path("/fahrenheit")
    public Response convertToFahrenheitQuery(@QueryParam("param") int temp){
        String output = temp + "C is " +  String.valueOf(temp * 9 / 5 + 32) + "F";
        return Response.status(200).entity(output).build();
    }
}
