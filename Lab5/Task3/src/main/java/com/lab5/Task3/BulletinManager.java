package com.lab5.Task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class BulletinManager implements IBulletinManager {

    private List<Message> messages;

    @Autowired
    public BulletinManager(){
        messages = new ArrayList<>();
    }

    @Override
    public void addMessage(Message msg){
        messages.add(msg);
    }
    @Override
    public Message getMessage(UUID id){
        int index = 0;

        while(index < messages.size()){
            Message message = messages.get(index);

            if(message.getId().equals(id)){
                return message;
            }
            index++;
        }

        return null;
    }
    @Override
    public List<Message> getMessagesByAuthor(String author){
        int index = 0;
        List<Message> list = new ArrayList<>();

        while(index < messages.size()){
            Message message = messages.get(index);

            if(message.getAuthor().equals(author)){
                list.add(message);
            }
            index++;
        }

        return list;
    }
    @Override
    public List<Message> getAllMessages(){
        return messages;
    }

}

