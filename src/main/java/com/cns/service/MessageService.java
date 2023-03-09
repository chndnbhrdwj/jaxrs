package com.cns.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.cns.database.Database;
import com.cns.model.Message;

public class MessageService {

    private Map<Long, Message> messages = Database.getMessages();

    public MessageService() {
        Message m1 = new Message(1l, "Hello World", "Chandan");
        Message m2 = new Message(2l, "Hey World", "Chandan1");
        Message m3 = new Message(3l, "Hi World", "Chandan2");
        messages.put(m1.getId(), m1);
        messages.put(m2.getId(), m2);
        messages.put(m3.getId(), m3);
    }

    public List<Message> getAllMessages() {
        return new ArrayList<Message>(messages.values());
    }

    public Message getMessage(Long id) {
        return messages.get(id);
    }

    public Message addMessage(Message message) {
        message.setId(Long.valueOf(messages.size() + 1));
        messages.put(message.getId(), message);
        return message;
    }

    public Message updateMessage(Message message) {
        messages.put(message.getId(), message);
        return message;
    }

    public Message removeMessage(Long id) {
        return messages.remove(id);
    }
}
