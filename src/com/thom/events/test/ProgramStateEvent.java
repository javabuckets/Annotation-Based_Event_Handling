package com.thom.events.test;

import com.thom.events.Event;

/**
 * @author Thomas Boel Micheelsen
 * Created 1/2/2018
 */
public class ProgramStateEvent extends Event {
    private ProgramState programState;

    public ProgramStateEvent(String name, ProgramState programState) {
        super(name);
        this.programState = programState;
    }

    public ProgramState getProgramState() {
        return programState;
    }
}
