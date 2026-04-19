package fr.captain.mycoolapp.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("Class: " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "TENNIS: Practise your backhand volley.";
    }

    // defining our init method
    @PostConstruct
    public void doStartUpStuff() {
        System.out.println("In doStartupStuff() for: " + this.getClass().getSimpleName());
    }

    // defining our destroy method
    @PreDestroy
    public void doCleanUpStuff() {
        System.out.println("In doCleanUpStuff() for: " + this.getClass().getSimpleName());
    }
}
