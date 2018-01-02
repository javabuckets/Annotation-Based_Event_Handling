package com.thom.events;

/**
 * @author Thomas Boel Micheelsen
 * Created 1/2/2018
 */
public abstract class Event {
    private String name;

    public Event(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}