public class Book {
    private String title;
    private String genre;
    private String author;
    private int pages;

    public Book() {
        title = "";
        genre = "";
        author = "";
        pages = 0;
    }

    public Book(String t, String g, String a, int p) {
        title = t;
        genre = g;
        author = a;
        pages = p;
    }
}
