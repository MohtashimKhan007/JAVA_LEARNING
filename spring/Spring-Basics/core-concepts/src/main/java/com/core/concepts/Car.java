package com.core.concepts;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component("car")
public class Car implements InitializingBean,DisposableBean {
    private Engine e;


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

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("We are in in after property set ");

    }
    @Override
    public void destroy() throws Exception {
        System.err.println("Destroy method is being called"); // System.err use karein (Red color mein dikhega)
        System.out.flush();
    }


}