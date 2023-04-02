package day_21_array;

public class Store {
    public static void main(String[] args) {
        String [] item = {"Shoes","Jaket","Gloves","Hat","Dress","Sunglasses"};
        boolean hasHat = false;

        for (int i = 0; i < item.length; i++) {
            if (item[i].equalsIgnoreCase("hat")){
                hasHat = true;
                break;

            }

        }if (hasHat){
            System.out.println("Hat item is avaliable");
        }else {
            System.out.println("Hat item is not avaliable");
        }//we need to use boolean because we cant print else without boolean
    }
}
