package day24_method;
/*

      all will accept array argument

      create a method that will print the first element
      create a method that will print the last element
      create a method that will print the element/s
      length matters -> even there is middle, for odd there is one middle

   */



public class OurArray {
    public static void main(String[] args) {
        int [] nums = {12,45,46,87,987,544};
        firstElement(nums);
        lastElement(nums);
        eachElement(nums);
        findMidle(nums);

    }

    public static void firstElement (int [] nums){
        System.out.println("First element: "+ nums[0]);
    }

    public static void lastElement (int [] nums){
        System.out.println("First element: "+ nums[nums.length-1]);
    }

    public static void eachElement (int [] userArray){
        for (int each:userArray) {
            System.out.print(each+" ");

        }
    }

    public static void findMidle(int [] nums){
        if (nums.length%2==0){
            System.out.println("\nMy middles is "+nums[nums.length/2-1]+" and "+nums[nums.length/2]);
        }else {
            System.out.println("\nMy middles is "+nums[nums.length/2]);

        }
    }



}
