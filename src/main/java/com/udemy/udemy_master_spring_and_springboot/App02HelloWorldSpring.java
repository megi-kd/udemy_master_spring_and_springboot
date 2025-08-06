package com.udemy.udemy_master_spring_and_springboot;

import com.udemy.udemy_master_spring_and_springboot.game.GameRunner;
import com.udemy.udemy_master_spring_and_springboot.game.PacManGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

    public static void main(String[] args) {

        //launching the spring context using our configuration class HelloWorldConfiguration
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        //the configuration class has a bean created using @Bean annotation on the method name()
        //Retrieving the beans managing by Spring
        System.out.println(context.getBean("name"));
    }
}
