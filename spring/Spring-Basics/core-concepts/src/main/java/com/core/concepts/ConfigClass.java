package com.core.concepts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

    // XML ka <bean id="e" class="...Engine">
    @Bean(name = "e")
    public Engine engine() {
        return new Engine();
    }

    // XML ka <bean id="car" class="...Car">
    @Bean(name = "car")
    public Car car() {
        Car car = new Car();
        // XML ka <property name="engine" ref="e" />
        car.setEngine(engine());
        return car;
    }
}