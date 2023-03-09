package com.cns.exception;

import com.cns.model.ErrorMessage;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<MessageNotFoundException> {

    @Override
    public Response toResponse(MessageNotFoundException exception) {
        ErrorMessage error = new ErrorMessage(exception.getMessage(), 404, "alink");
        return Response.status(Status.NOT_FOUND)
                .entity(error)
                .build();
    }
}
