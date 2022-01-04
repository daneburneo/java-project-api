package br.com.supermercado.api.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello-world")
public class HelloWorldResource {

    @GET
    public String helloWorld() {
        return "Está funcionando";
    }
}
