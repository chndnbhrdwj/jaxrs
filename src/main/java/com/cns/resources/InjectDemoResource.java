package com.cns.resources;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.CookieParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.MatrixParam;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/injectdemo")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class InjectDemoResource {

    @GET
    @Path("annotations")
    public String getParamsUsingAnnotations(@MatrixParam("param") String matrixParam,
            @HeaderParam("customHeaderParam") String headerParam,
            @CookieParam("cookieName") String cookieName) {
        return "matrixparam: " + matrixParam + "  ### HeaderParam is : " + headerParam + "  ## cookie is : "
                + cookieName;
    }
    // @FormParam used to get the form data from html page

}
