package fr.captain.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    public BaseballCoach() {
        System.out.println("Class: " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "BASEBALL: Spend 30 minutes in batting position.";
    }
}
