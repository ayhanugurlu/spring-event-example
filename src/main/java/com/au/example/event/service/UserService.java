package com.au.example.event.service;

import com.au.example.event.db.User;

/**
 * Created by Ayhan.Ugurlu on 02/11/2018
 */

public interface UserService {

    void createUser(User user);

    void getUser(long userId);
}
