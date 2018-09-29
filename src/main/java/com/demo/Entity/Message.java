package com.demo.Entity;

public class Message {

    private int id;
    private int conversationId;
    private String content;
    private String sender;
    private Boolean isOwner;
    private Boolean readStatus;

    public Message(int id, int conversationId, String content, String sender, Boolean isOwner, Boolean readStatus) {
        this.id = id;
        this.conversationId = conversationId;
        this.content = content;
        this.sender = sender;
        this.isOwner = isOwner;
        this.readStatus = readStatus;
    }

    public Message() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getConversationId() {
        return conversationId;
    }

    public void setConversationId(int conversationId) {
        this.conversationId = conversationId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Boolean getOwner() {
        return isOwner;
    }

    public void setOwner(Boolean owner) {
        isOwner = owner;
    }

    public Boolean getReadStatus() {
        return readStatus;
    }

    public void setReadStatus(Boolean readStatus) {
        this.readStatus = readStatus;
    }
}
