package fr.captain.mycoolapp.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("Class: " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "TENNIS: Practise your backhand volley.";
    }
}
