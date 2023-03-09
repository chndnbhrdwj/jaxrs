package com.cns.resources;

import java.util.List;

import com.cns.model.Message;
import com.cns.resources.beans.MessageFilterBeans;
import com.cns.service.MessageService;

import jakarta.ws.rs.BeanParam;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;

@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {

    MessageService messageService = new MessageService();

    @Path("/{id}/comments")
    public CommentsResource getCommentsResource() {
        return new CommentsResource();
    }

    @GET
    public List<Message> getMessagesUsingBeanParam(@BeanParam MessageFilterBeans messageFilterBeans) {
        if (messageFilterBeans.getYear() < 0) {
            System.out.println("year was not greater than 0");
        }
        return messageService.getAllMessages();
    }

    @GET
    @Path("/{id}")
    public Message getMessage(@PathParam("id") Long id) {
        return messageService.getMessage(id);
    }

    @PUT
    @Path("/{id}")
    public Message updateMessage(@PathParam("id") Long id, Message message) {
        message.setId(id);
        return messageService.updateMessage(message);
    }

    @POST
    public Response addMessage(Message message, @Context UriInfo uriInfo) {
        Message newMessage = messageService.addMessage(message);
        return Response.created(uriInfo
                .getAbsolutePathBuilder()
                .path(newMessage.getId().toString())
                .build())
                .entity(newMessage)
                .build();
    }

    @DELETE
    @Path("/{id}")
    public Message deleteMessage(@PathParam("id") Long id) {
        return messageService.getMessage(id);
    }

}
