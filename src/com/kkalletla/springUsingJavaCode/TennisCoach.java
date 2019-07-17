package com.kkalletla.springUsingJavaCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class TennisCoach implements Coach {

    private final String className = "TennisCoach: ";
    FortuneService services;

    public TennisCoach() {
        System.out.println(className+"Inside Default Constructor");
    }

    public TennisCoach(FortuneService services) {
        System.out.println(className+"Inside Parameterize Constructor");
        this.services = services;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand Volley";
    }

    @Override
    public String getDailyFortune() {
        return services.getFortune();
    }

    /*@Autowired
    public void setServices(FortuneService services) {
        System.out.println(className+"Inside setServices method");
        this.services = services;
    }*/

    /*@Autowired
    @Qualifier("happyFortuneService")
    public void setServicesParameter(FortuneService services){
        System.out.println(className+"Inside setServicesParameter method");
        this.services=services;
    }*/
}
