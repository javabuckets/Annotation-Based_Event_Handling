package com.thom.events2.test;

import com.thom.events2.EventPublisher;
import com.thom.events2.HandlerRegistry;
import com.thom.events2.test.events.ByeEvent;
import com.thom.events2.test.events.HelloEvent;

/**
 * @author Thomas Boel Micheelsen
 * Created 1/3/2018
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.preInit();
        main.init();
    }

    private void preInit() {
        HandlerRegistry.register(MyEventHandler.class);
    }

    private void init() {
        EventPublisher.raiseEvent(new HelloEvent());
        EventPublisher.raiseEvent(new ByeEvent());
    }
}
