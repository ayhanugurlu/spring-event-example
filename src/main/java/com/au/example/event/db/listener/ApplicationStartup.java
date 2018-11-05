package com.au.example.event.db.listener;

import com.au.example.event.db.User;
import com.au.example.event.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by Ayhan.Ugurlu on 02/11/2018
 */
@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    UserService userService;


    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        User user = new User();
        user.setMail("ayhan");
        userService.createUser(user);
        System.out.println("user created");
        userService.getUser(1);
        System.out.println("user got");
    }
}