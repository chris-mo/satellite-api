package com.demo.Service;

import com.demo.Dao.MessageDao;
import com.demo.Entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MessageService {

    @Autowired
    private MessageDao messageDao;

    public Collection<Message> getAllMessages() {
        return this.messageDao.getAllMessages();
    }

    public Message getMessageById(int id) {
        return this.messageDao.getMessageById(id);
    }

    public void removeMessageById(int id) {
        this.messageDao.removeMessageById(id);
    }

    public void updateMessage(Message message) {
        this.messageDao.updateMessage(message);
    }

    public void insertMessage(Message message) {
        this.messageDao.insertMessage(message);
    }
}
