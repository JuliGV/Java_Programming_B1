package day23_multidimensional_arrays;
/*
Task:
            Given an app name and a String of zones in the following format

			us-east-1,us-west-1,us-west-2,us-west-3

			print the app deploying to each zone

		Ex:
			app = etsy
    			zones = us-east-1,us-west-2,us-west-1


    			output:
				Deploying etsy to us-east-1...
				Deployment completed for us-east-1

				Deploying etsy to us-west-1...
				Deployment completed for us-west-1

				Deploying etsy to us-west-2...
				Deployment completed for us-west-2


 */

public class AWS {
    public static void main(String[] args) {
        String server = "amazon";
        String zones = "us-east-1,us-west-1,us-west-2,us-west-3";

        String [] zonesArray = zones.split(",");
//        for (int i = 0; i < zonesArray.length; i++) {
//            System.out.println("Deploying "+server+" to "+zonesArray[i]+"\nDeployment completed for "+zonesArray[i]+"\n");
//
//        }


        for (String each:zonesArray) {
            System.out.println("Deploying "+server+" to "+each+"\nDeployment completed for "+each+"\n");


        }
    }
}
