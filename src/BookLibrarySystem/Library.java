package BookLibrarySystem;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
//itt történik a könyvek tárolása és velük kapcsolatos műveletek.
public class Library {
    private Set<Book> books;

    /*public, mert a mainben akarom használni
     * ez a library constructora*/
    public Library(Set<Book> books) {
        this.books = books;
    }

    /*public, mert a mainben akarom használni
     * void, mert nem ad vissza értéket
     * a paraméternnek megadott könyveket hozzáadja a books SET-hez*/
    public void addBook(Book... book) {
        this.books.addAll(List.of(book)); //Arrays.toList is jó
    }

    /*public, mert a mainben akarom használni
     * Book-ot ad vissza.
     * Egy stringet kap, végigiterál a books SET-en és ha talál, visszaadja a talált könyvet*/
    public Book findBookByTitle(String title) {
        for (Book book : books)
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        return null;
    }

    /*public, mert a mainben akarom használni
     * Egy book set-et ad vissza, amelyet a metóduson belül hozok létre, hiszen máshol nem használom.
     * Ezt üresen hozom létre, ha nincs találat visszaadja az üres listát
     * végigiterálok a books set-en és a foundbooks set-be dobom a találatokat
     * a végén visszaadom azon könyvek gyújteményét, amelyek megfeleltek a feltételnek (author)*/
    public Set<Book> findBookByAuthor(String author) {
        Set<Book> foundBooks = new HashSet<>();
        for (Book book : books)
            if (book.getAuthor().equalsIgnoreCase(author)) {
                foundBooks.add(book);
            }
        return foundBooks;
    }

}
