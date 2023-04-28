package day35_inheritance.Book;

public class EBook extends Book{
    int size;
    int pages;
    public void read(){
        System.out.println("Reading  digital copy a book "+ title+" by "+author);
    }

}
