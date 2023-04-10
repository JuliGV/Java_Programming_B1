package day27_wrapper_arraylist;

public class GoogleSearch {
    public static void main(String[] args) {
        String result = "About, 1,700,000,000 results (0.43 seconds";

        String []strArr = result.split(" ");
        String resultCount = strArr[1];
        String time = strArr[3];

        resultCount = strArr[1].replace(",","");
         time = strArr[3].substring(1);

         // convert to primitive DT

        long resultNum = Long.parseLong(resultCount);
        double timeNum = Double.parseDouble(time);

        if ( resultNum>0){
            System.out.println("we are getting correct among of result");

        }
        if (timeNum>10){
            System.out.println("It tooks a lot of time load the page");
        }

    }
}
