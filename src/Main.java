import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Library bibliotek = new Library();
        Scanner scanner = new Scanner(System.in);

        bibliotek.addBook(new Book("Kalle Hansson", "Gröna människor", 35));
        bibliotek.addBook(new Book("Kalle Bengtsson", "Blåa människor", 35));
        bibliotek.addBook(new Book("Bengt Karlsson", "Gula människor", 100));
        bibliotek.addBook(new Book("Bengt Carlsson", "Röda människor", 70));

        while (true) {
            System.out.println("\n1. Lägg till en bok");
            System.out.println("2. Visa alla böcker");
            System.out.println("3. Avsluta");
            System.out.print("Välj ett alternativ: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Är det en (1) facklitterär eller (2) skönlitterär bok? ");
                int bookType = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Ange författare: ");
                String author = scanner.nextLine();

                System.out.print("Ange titel: ");
                String title = scanner.nextLine();

                System.out.print("Ange antal sidor: ");
                int pages = scanner.nextInt();
                scanner.nextLine();

                Book newBook;
                if (bookType == 1) {
                    newBook = new NonFictionBook(author, title, pages);
                } else {
                    newBook = new FictionBook(author, title, pages);
                }

                bibliotek.addBook(newBook);
                System.out.println("Boken har lagts till.\n");

            } else if (choice == 2) {
                bibliotek.printAllBooks();

            } else if (choice == 3) {
                System.out.println("Avslutar programmet.");
                break;

            } else {
                System.out.println("Ogiltigt val, försök igen.\n");
            }
        }

        scanner.close();
    }
}
