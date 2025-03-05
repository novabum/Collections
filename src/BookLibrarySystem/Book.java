package BookLibrarySystem;
/*Itt készülnek a könyvek privát (csak itt érhető el) végleges (nem változik a jövőben) tulajdonságokkal*/
public class Book {
    private final String title;
    private final String author;
    private final Integer isbn;
//konstruktor
    public Book(String title, String author, Integer isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
//szükséges getter setterek
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    //toString override, hogy azt adja vissza, amit szeretnék. Esetünkben a példány tulajdonságait.
    @Override
    public String toString() {
        return (title + ", " + author + ", " + isbn);
    }
}
