public class NonFictionBook extends Book{
    private String subject;

    public NonFictionBook(String author, String title, int pages) {
        super(author, title, pages);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject;
    }
}
