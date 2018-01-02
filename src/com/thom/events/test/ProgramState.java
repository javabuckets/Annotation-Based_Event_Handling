package com.thom.events.test;

import com.thom.events.EventDispatcher;

/**
 * @author Thomas Boel Micheelsen
 * Created 1/2/2018
 */
public class ProgramState extends EventDispatcher {
    private String state;

    public void changeState(String state) {
        this.state = state;
        dispatchEvent(new ProgramStateEvent(state, this));
    }

    public void start() {
        changeState("starting");
    }

    public void stop() {
        changeState("stopping");
    }

    public String getState() {
        return state;
    }
}
