package fr.captain.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    public TrackCoach() {
        System.out.println("Class: " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "TRACK: run a hard 5K.";
    }
}
