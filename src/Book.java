public class Book {
    private String author;
    private String title;
    private int pages;

    public Book(String author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Pages: " + pages;
    }
}
