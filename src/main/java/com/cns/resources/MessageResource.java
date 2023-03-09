package com.cns.resources;

import java.util.List;

import com.cns.model.Message;
import com.cns.service.MessageService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {

    MessageService messageService = new MessageService();

    @GET
    public List<Message> getMessages(@QueryParam("year") int year) {
        if (year > 0) {
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
    public Message addMessage(Message message) {
        return messageService.addMessage(message);
    }

    @DELETE
    @Path("/{id}")
    public Message deleteMessage(@PathParam("id") Long id) {
        return messageService.getMessage(id);
    }

}
