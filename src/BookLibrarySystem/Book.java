package BookLibrarySystem;

public class Book {
    private final String title;
    private final String author;
    private final Integer isbn;

    public Book(String title, String author, Integer isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return (title + ", " + author + ", " + isbn);
    }
}
