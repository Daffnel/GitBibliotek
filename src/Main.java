import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library bibliotek = new Library();
        Scanner scanner = new Scanner(System.in);

        // Förifyllda böcker
        Book bok = new Book("Kalle Hansson", "Gröna människor", 35);
        Book bok1 = new Book("Kalle Bengtsson", "Blåa människor", 35);
        Book bok2 = new Book("Bengt Karlsson", "Gula människor", 100);
        Book bok3 = new Book("Bengt Carlsson", "Röda människor", 70);

        bibliotek.addBook(bok);
        bibliotek.addBook(bok1);
        bibliotek.addBook(bok2);
        bibliotek.addBook(bok3);

        while (true) {
            System.out.println("\n1. Lägg till en bok");
            System.out.println("2. Visa alla böcker");
            System.out.println("3. Avsluta");
            System.out.print("Välj ett alternativ: ");


    }
}
