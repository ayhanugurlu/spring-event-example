package com.au.example.event.db.repository;

import com.au.example.event.db.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ayhan.Ugurlu on 02/11/2018
 */
public interface UserRepository  extends JpaRepository<User,Long> {

}
