package com.au.example.event.service;

import com.au.example.event.db.User;
import com.au.example.event.db.repository.UserRepository;
import com.au.example.event.event.GetUserEvent;
import com.au.example.event.event.UserCreatedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ayhan.Ugurlu on 02/11/2018
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    ApplicationEventPublisher eventPublisher;

    @Autowired
    UserRepository userRepository;

    @Transactional
    @Override
    public void createUser(User user) {
        eventPublisher.publishEvent(new UserCreatedEvent(user));
        this.userRepository.save(user);
    }



    @Override
    public void getUser(long userId) {

        User user = this.userRepository.getOne(userId);
        eventPublisher.publishEvent(new GetUserEvent(user));

    }
}
