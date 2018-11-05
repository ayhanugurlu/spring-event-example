package com.au.example.event.db;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by Ayhan.Ugurlu on 02/11/2018
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(unique=true)
    private String mail;
    private String password;


}