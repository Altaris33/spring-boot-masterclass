package fr.captain.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "BASEBALL: Spend 30 minutes in batting position.";
    }
}
