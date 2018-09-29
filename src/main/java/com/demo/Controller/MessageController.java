package com.demo.Controller;

import com.demo.Entity.Message;
import com.demo.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Message> getAllMessages() {
        return this.messageService.getAllMessages();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Message getMessageById(@PathVariable("id") int id) {
        return this.messageService.getMessageById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteMessageById(@PathVariable("id") int id) {
        this.messageService.removeMessageById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateMessage(@RequestBody Message message) {
        this.messageService.updateMessage(message);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertMessage(@RequestBody Message message) {
        this.messageService.insertMessage(message);
    }
}
