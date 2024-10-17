import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();  // Skapa ett nytt bibliotek
        Scanner scanner = new Scanner(System.in);  // Skapa en scanner för att läsa inmatning

        while (true) {
            System.out.println("1. Lägg till en bok");
            System.out.println("2. Visa alla böcker");
            System.out.println("3. Avsluta");
            System.out.print("Välj ett alternativ: ");

            int choice = scanner.nextInt();  // Läs användarens val
            scanner.nextLine();

            if (choice == 1) {
                // Lägg till en bok
                System.out.print("Ange författare: ");
                String author = scanner.nextLine();  // Läs författare

                System.out.print("Ange titel: ");
                String title = scanner.nextLine();  // Läs titel

                System.out.print("Ange antal sidor: ");
                int pages = scanner.nextInt();  // Läs antal sidor
                scanner.nextLine();

                // Skapa och lägg till en bok
                library.addBook(new Book(author, title, pages));
                System.out.println("Boken har lagts till.\n");

            } else if (choice == 2) {
                // Visa alla böcker
                library.showBooks();

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
