package com.core.concepts;

public class Car {
    private Engine e;

    // Galat: public class getengine() { ... }
    // Sahi: ye ek 'method' hai, 'class' nahi.
    public Engine getEngine() {
        return e;
    }

    public void setEngine(Engine e) {
        this.e = e;
    }

    public void start() {
        e.startEngine();
        System.out.println("Car started");
    }
}