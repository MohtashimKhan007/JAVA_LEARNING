package com.core.concepts;

public class car {
    private engine e;

    // Galat: public class getengine() { ... }
    // Sahi: ye ek 'method' hai, 'class' nahi.
    public engine getEngine() {
        return e;
    }

    public void setEngine(engine e) {
        this.e = e;
    }

    public void start() {
        e.startEngine();
        System.out.println("Car started");
    }
}