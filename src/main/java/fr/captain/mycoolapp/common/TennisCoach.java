package fr.captain.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "TENNIS: Practise your backhand volley.";
    }
}
