package day32_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffer {
    public static void main(String[] args) {
        OfferV2 offer = new OfferV2("Google","California", 123_000.0,true, 28);
        System.out.println(offer);
        System.out.println();

        OfferV2 offer2 = new OfferV2("Amazon","New York",123_000.0);
        System.out.println(offer2);

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Hello","Bye"));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4));

        ArrayList<OfferV2> offerList = new ArrayList<>();
        offerList.add(offer);
        offerList.add(offer2);
        System.out.println();


        for (OfferV2 each:offerList) {
            System.out.println(each);
            System.out.println();
            System.out.println(each.company);//get only company

        }
        OfferV2 [] offers = {offer,offer2};
        OfferV2 [] offerArr = {new OfferV2("Tesla","Texas"),
                              new OfferV2("Jira","New York")};




    }
}
