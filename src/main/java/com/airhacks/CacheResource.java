package com.airhacks;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("cache")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CacheResource {

    @GET
    public String getJSON(@QueryParam("key") final String key) {
        return "helloworld";
    }

    @PUT
    public void putJSON(@QueryParam("key") final String key, final String content) {
    }

    @DELETE
    public void deleteJSON(@QueryParam("key") final String key) { }
}
