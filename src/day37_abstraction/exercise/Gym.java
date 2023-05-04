package day37_abstraction.exercise;

public class Gym {
    public static void main(String[] args) {
        Running run = new Running("Running");
        System.out.println(run.name);
        run.performExercise();
        System.out.println(run.getCaloriesBurned(10));

    }
}
