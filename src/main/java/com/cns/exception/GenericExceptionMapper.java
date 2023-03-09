package com.cns.exception;

import com.cns.model.ErrorMessage;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.ext.ExceptionMapper;

//@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

    @Override
    public Response toResponse(Throwable exception) {
        ErrorMessage error = new ErrorMessage(exception.getMessage(), 500, "alink");
        return Response.status(Status.INTERNAL_SERVER_ERROR)
                .entity(error)
                .build();
    }
}
