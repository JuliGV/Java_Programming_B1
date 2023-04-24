package day33_static;

import java.util.ArrayList;
import java.util.Arrays;

public class UsingSong {
    public static void main(String[] args) {
        Song song1 = new Song("Waka waka",3.34);
        Song song2 = new Song("Stina",2.34,"Bitles");
        Song song3 = new Song("Mriy",3.27,"Skay","Rock");

        ArrayList<Song> songsList = new ArrayList<>();
        songsList.addAll(Arrays.asList(song1,song2,song3));

        System.out.println(songsList);
        for (Song each:songsList) {
            System.out.println(each);

        }

        songsList.removeIf(each ->each.genre == null);
        System.out.println(songsList);
        songsList.add(song2);
        System.out.println();

        songsList.removeIf(each -> each.length<3.0 );
        System.out.println(songsList);
    }
}
