package fr.captain.mycoolapp.rest;

import fr.captain.mycoolapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach coach;

    // define a method for dependency injection (using a setter naming convention)
    @Autowired
    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/daily-workout")
    public String getDailyWorkout(){
        return coach.getDailyWorkout();
    }
}
