package com.demo.Dao;

import com.demo.Entity.Message;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class FakeMessageDaoImpl implements MessageDao {

    private static Map<Integer, Message> messages;

    static {
        messages = new HashMap<Integer, Message>() {
            {
                put(1, new Message(1, 1, "This is a message", "sender@gmail.com", false, false));
                put(2, new Message(2, 1, "This is a response", "receiver@gmail.com", false, true));
             }
        };
    }

    @Override
    public Collection<Message> getAllMessages() {
        return this.messages.values();
    }

    @Override
    public Message getMessageById(int id) {
        return this.messages.get(id);
    }

    @Override
    public void removeMessageById(int id) {
        this.messages.remove(id);
    }

    @Override
    public void updateMessage(Message message) {
        Message m = this.messages.get(message.getId());

        m.setContent(message.getContent());
        m.setOwner(message.getOwner());
        m.setReadStatus(message.getReadStatus());
        m.setSender(message.getSender());

        this.messages.put(message.getId(), message);
    }

    @Override
    public void insertMessage(Message message) {
        this.messages.put(message.getId(), message);
    }
}
