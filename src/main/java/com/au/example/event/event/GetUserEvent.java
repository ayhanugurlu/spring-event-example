package com.au.example.event.event;

import com.au.example.event.db.User;

/**
 * Created by Ayhan.Ugurlu on 02/11/2018
 */
public class GetUserEvent extends CreationEvent<User> {

    public GetUserEvent(User user) {
        super(user);
    }

}
