package com.lab5.Task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/bulletinboard")
public class BBController {

    @Autowired
    private IBulletinManager iBulletinManager;

    @GetMapping("/msg")
    public ModelAndView getMessageById(@RequestParam UUID id){

        List<Message> messages = new ArrayList<>();

        Message message = iBulletinManager.getMessage(id);
        messages.add(message);

        ModelAndView modelAndView = new ModelAndView("messages");
        modelAndView.addObject("messages", messages);

        return modelAndView;
    }

    @GetMapping("/msg/{author}")
    public ModelAndView getMessageByAuthor(@PathVariable String author){

        List<Message> messages = iBulletinManager.getMessagesByAuthor(author);
        ModelAndView modelAndView = new ModelAndView("messages");
        modelAndView.addObject("messages", messages);

        return modelAndView;
    }

    @GetMapping("/all")
    public ModelAndView getMessageByAll(){

        List<Message> messages = iBulletinManager.getAllMessages();
        ModelAndView modelAndView = new ModelAndView("messages");
        modelAndView.addObject("messages", messages);

        return modelAndView;
    }

    @GetMapping("/form")
    public ModelAndView getNewMessage(@ModelAttribute Message message){

        ModelAndView modelAndView = new ModelAndView("messageForm");

        return modelAndView;
    }

    @PostMapping("/add")
    public ModelAndView addMessage(Message message){
        iBulletinManager.addMessage(message);

        List<Message> messages = new ArrayList<>();
        messages.add(message);

        ModelAndView modelAndView = new ModelAndView("messages");
        modelAndView.addObject("messages",message);

        return modelAndView;
    }
}
