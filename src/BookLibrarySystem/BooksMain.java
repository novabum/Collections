package BookLibrarySystem;

import java.util.HashSet;


public class BooksMain {
    public static void main(String[] args) {
        Library library = new Library(new HashSet<>());
        Book book1 = new Book("A fenyvedék nyuggerája", "Nyomi Genny", 435234213);
        Book book2 = new Book("Lompos aszteroida 1", "Nyafter Hihhi", 112344645);
        Book book5 = new Book("Lompos aszteroida 2", "Nyafter Hihhi", 112344645);
        Book book3 = new Book("Pilótakeksz-szeksz", "Jordan Jordan", 895648378);
        Book book4 = new Book("Oceanic szenvedés 1", "Jolán Cudek", 61234783);
        Book book6 = new Book("Oceanic szenvedés 2", "Jolán Cudek", 61234783);

        library.addBook(book1, book1, book2, book3, book4, book5, book6); //kétszer teszem bele a book1-et, úgyis felülírja a SET

        //findBookByTitle teszt
        System.out.println((library.findBookByTitle("Lompos aszteroida 2").toString()));
        System.out.println("--------------");
        //findBookByAuthor teszt
        System.out.println((library.findBookByAuthor("Nyafter Hihhi").toString()));


    }
}