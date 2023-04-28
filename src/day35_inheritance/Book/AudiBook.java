package day35_inheritance.Book;

public class AudiBook extends Book{

    double duration;
    String narrator;

    public void listen(){
        System.out.println("Listening the audio book "+title+" by "+author);
    }


}
