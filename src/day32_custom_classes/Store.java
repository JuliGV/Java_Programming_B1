package day32_custom_classes;


import java.util.ArrayList;
import java.util.Arrays;

public class Store {
    public static void main(String[] args) {

        Food apple = new Food("Apple");
        Food grape = new Food("Grape",4);
        Food banana = new Food("Banana",10,5.67);
        Food [] foodArr = {grape,apple,banana};//add object to array
        ArrayList<Food> foodList = new ArrayList<>();
        foodList.addAll(Arrays.asList(apple,banana,grape));
        for (int i = 0; i < foodList.size(); i++) {

            if (     (foodList.get(i).name.charAt(0)+"").equalsIgnoreCase("a")    ) {
                System.out.println(foodList.get(i));
            }

        }

    }
}
