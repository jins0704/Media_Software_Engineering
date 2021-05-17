package com.lab5.Task3;

import java.util.UUID;

public class Message {

    private UUID id;
    private String author;
    private String subject;
    private String messageBody;

    public Message() {
        UUID newId = UUID.randomUUID();
        this.id = newId;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }
    public UUID getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessageBody() {
        return messageBody;
    }
}
