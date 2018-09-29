package com.demo.Service;

import com.demo.Dao.FakeMessageDaoImpl;
import com.demo.Entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MessageService {

    @Autowired
    private FakeMessageDaoImpl messageDao;

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

    public Message insertMessage(String content) {
        return this.messageDao.insertMessage(content);
    }
}
