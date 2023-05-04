package day37_abstraction.exercise;

public class Running extends Exercise{


    public void performExercise(){
        System.out.println("Running for fun.");

    }

    public int getCaloriesBurned(int min){
        return min*5;

    }
    public Running(String name){
        super(name);
    }

    public void test(){
        System.out.println("hjk");
    }

}
