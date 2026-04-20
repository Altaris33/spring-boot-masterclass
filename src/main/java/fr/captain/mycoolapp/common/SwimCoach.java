package fr.captain.mycoolapp.common;

public class SwimCoach implements Coach{

    public SwimCoach() {
        System.out.println("Class: " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "SWIMCOACH -> Swim 1000 meters as a warm up";
    }
}
