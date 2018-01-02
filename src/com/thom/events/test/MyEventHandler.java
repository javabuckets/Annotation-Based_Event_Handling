package com.thom.events.test;

import com.thom.events.EventHandler;

/**
 * @author Thomas Boel Micheelsen
 * Created 1/2/2018
 */
public class MyEventHandler {
    @EventHandler("starting")
    public void programStartup(ProgramStateEvent event) {
        System.out.println(event.getProgramState().getState());
    }

    @EventHandler("stopping")
    public void programStopped(ProgramStateEvent event) {
        System.out.println(event.getProgramState().getState());
    }
}
