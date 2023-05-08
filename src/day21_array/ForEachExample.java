package day21_array;

public class ForEachExample {
    public static void main(String[] args) {
        int [] nums ={30,12,159,12};

        for (int i = 0; i < nums.length; i++) {//tradition way
            System.out.println(nums[i]);

        }

        for (int each:nums) {
            System.out.println(each);

        }
        String [] words = {"java","soft skill","selenium", "sql","api"};

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);

        }
        for (String each:words) {
            System.out.println(each);

        }

    }
}
