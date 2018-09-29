package com.demo.Dao;

import com.demo.Entity.Message;

import java.util.Collection;

public interface MessageDao {
    Collection<Message> getAllMessages();

    Message getMessageById(int id);

    void removeMessageById(int id);

    void updateMessage(Message message);

    void insertMessage(Message message);
}
