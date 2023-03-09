package com.cns.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/")
public class CommentsResource {

    @GET
    public String test() {
        return "new sub resource for comments";
    }

    @GET
    @Path("/{commentId}")
    public String test1(@PathParam("id") long id, @PathParam("commentId") long commentId) {
        return "new sub resource for message : " + id + " and comment: " + commentId;
    }
}
