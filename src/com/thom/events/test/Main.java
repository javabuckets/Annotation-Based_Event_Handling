package com.thom.events.test;

/**
 * @author Thomas Boel Micheelsen
 * Created 1/2/2018
 */
public class Main {
    public static void main(String[] args) {
        ProgramState programState = new ProgramState();
        programState.addHandler(new MyEventHandler());

        programState.start();
        programState.stop();
    }
}
