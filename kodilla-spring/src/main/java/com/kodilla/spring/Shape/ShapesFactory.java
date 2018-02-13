package com.kodilla.spring.Shape;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Random;

@Configuration
public class ShapesFactory {
    @Bean
    public Square createSquare(){
        return new Square();
    }

    @Bean
    @Scope("prototype")
    public Shape choosenShape() {
        Shape theShape;
        Random generator = new Random();
        int choosen = generator.nextInt(4);
        if (choosen == 0) {
            theShape = new Triangle();
        } else if (choosen == 1) {
            theShape = new Circle();
        } else {
            theShape = new Square();
        }
        return theShape;
    }
}
