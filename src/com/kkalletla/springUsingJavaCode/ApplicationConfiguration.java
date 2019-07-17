package com.kkalletla.springUsingJavaCode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class ApplicationConfiguration {

    @Bean
    public FortuneService happyFortuneServices(){
        return new HappyFortuneService();
    }

    @Bean
    public Coach tennisCoach(FortuneService services){
        return new TennisCoach(happyFortuneServices());
    }
}
