public class Main {
    public static void main(String[] args) {

        Library bibliotek = new Library();

        Book bok = new Book("Kalle Hansson", "Gröna människor", 35);
        Book bok1 = new Book("Kalle Bengtsson", "Blåa människor", 35);
        Book bok2 = new Book("Bengt Karlsson", "Gula människor", 100);
        Book bok3 = new Book("Bengt Carlsson", "Röda människor", 70);


        bibliotek.addBook(bok);
        bibliotek.addBook(bok1);
        bibliotek.addBook(bok2);
        bibliotek.addBook(bok3);

        bibliotek.printAllBooks();

        System.out.println();
    }
}
