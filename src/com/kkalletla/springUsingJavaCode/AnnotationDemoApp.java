package com.kkalletla.springUsingJavaCode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        /*Read Spring Config File*/
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        /*Retrieve the bean from Container*/
        Coach theCoach = context.getBean("tennisCoach",Coach.class);

        /*Call a method on the bean*/
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        /*Close the connection*/
        context.close();
    }
}
