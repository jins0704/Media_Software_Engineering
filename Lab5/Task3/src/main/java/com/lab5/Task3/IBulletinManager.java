package com.lab5.Task3;

import java.util.List;
import java.util.UUID;

public interface IBulletinManager {

    void addMessage(Message msg);
    Message getMessage(UUID id);
    List<Message> getMessagesByAuthor(String author);
    List<Message> getAllMessages();
}
