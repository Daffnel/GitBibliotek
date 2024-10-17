public class Main {
    public static void main(String[] args) {

        Library bibliotek = new Library();

        Book bok = new Book("kalle Hansson","Gröna människor",35);
        Book bok1 = new Book("kalle Bengtsson","blåa människor",35);

        bibliotek.addBook(bok1);

        bibliotek.printAllBooks();

        System.out.println("Hello world!");
    }
}