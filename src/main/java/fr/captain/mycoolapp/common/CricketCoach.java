package fr.captain.mycoolapp.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("Class: " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Cricket Coach : Practice Daily Workout for 15 minutes.";
    }
}
