package fr.captain.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "TRACK: run a hard 5K.";
    }
}
