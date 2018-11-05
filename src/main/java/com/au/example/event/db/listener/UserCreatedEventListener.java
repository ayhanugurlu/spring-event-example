package com.au.example.event.db.listener;

import com.au.example.event.db.User;
import com.au.example.event.event.CreationEvent;
import com.au.example.event.event.GetUserEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * Created by Ayhan.Ugurlu on 02/11/2018
 */
@Component
public class UserCreatedEventListener {

    /**
     *
     * When managed transaction commit
     * it is a special type of event
     * @param creationEvent
     */
    @TransactionalEventListener
    void onCreation(CreationEvent<User> creationEvent) {
        System.out.println("onCreation");
    }

    /**
     * When event publishes
     *
     * @param getUserEvent
     */
    @EventListener
    void onGetUser(GetUserEvent getUserEvent) {
        System.out.println("onGetUserEvent");
    }
}
