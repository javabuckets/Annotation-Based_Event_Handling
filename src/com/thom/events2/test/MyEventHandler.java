package com.thom.events2.test;

import com.thom.events2.EventHandler;
import com.thom.events2.test.events.ByeEvent;
import com.thom.events2.test.events.HelloEvent;

/**
 * @author Thomas Boel Micheelsen
 * Created 1/3/2018
 */
public class MyEventHandler {
    @EventHandler
    public void handle(HelloEvent event) {
        System.out.println("Hello!");
    }

    @EventHandler
    public void handle(ByeEvent event) {
        System.out.println("Bye!");
    }
}
