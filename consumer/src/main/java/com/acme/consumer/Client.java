package com.acme.consumer;

import com.acme.producer.Thing;

public class Client {
    private final Thing thing;

    public Client(Thing thing) {
        this.thing = thing;
    }

    public String doIt() {
        return "Version " + thing.getVersion();
    }
}