package day35_inheritance.Book;

public class Library {
    public static void main(String[] args) {
        Book book = new Book();

//        book.size();
//        book.duration(); can not reach methods from child class

        //can get only 6 instances
        EBook eBook = new EBook();
        //6 instances fron Super class, 2 instances from Ebook and 1 method
        eBook.size = 20;
        eBook.pages = 1000;
        eBook.title = "Soft Skills";
        eBook.author = "Nadir";
        eBook.read();

        AudiBook abook = new AudiBook();
        abook.duration = 2.3;
        abook.narrator = "Morgan Freeman";
        abook.title = "Java";
        abook.author = "James Gosling";

        abook.listen();

    }
}
