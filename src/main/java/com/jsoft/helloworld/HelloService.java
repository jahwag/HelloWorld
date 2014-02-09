package com.jsoft.helloworld;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

/**
 *
 * @author T
 */
@ApplicationPath("/")
@Path("/")
public class HelloService extends Application {

    public HelloService() {
    }

    @GET
    @Path("/Hello/{name}")
    public Response printMessage(@PathParam("name") String name) {
        return Response.status(200).entity("Hello " + name).build();
    }
}
