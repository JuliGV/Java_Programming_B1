package day26_methods;

public class SumOfElements {
    public static void main(String[] args) {
        int [] arr = {4,7,9,7,87};
        int [] arr2 = new int [] {7,9,7,65,87};
        System.out.println(sumOfElements(arr));
        System.out.println(sumOfElements2(65,98,76,45,9));
    }
    //varargs
    // create a method which accept int [] and return the sum of element

    public static int sumOfElements (int [] arr){
        int sum = 0;
        for (int each: arr) {
            sum += each;

        }return sum;

    }

    public static int sumOfElements2 (int ... arr){// ... must be in the end of the parameters (int num,int ...arr)
        int sum = 0;
        for (int each: arr) {
            sum += each;

        }return sum;

    }
}
