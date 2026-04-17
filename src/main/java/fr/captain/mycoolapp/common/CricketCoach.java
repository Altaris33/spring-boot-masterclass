package fr.captain.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Cricket Coach : Practice Daily Workout for 15 minutes.";
    }
}
