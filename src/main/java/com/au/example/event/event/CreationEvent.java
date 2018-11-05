package com.au.example.event.event;

/**
 * Created by Ayhan.Ugurlu on 02/11/2018
 */
public abstract class CreationEvent<T> {
    private final T object;

    CreationEvent(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
}