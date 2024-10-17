import java.util.Scanner;

public class LibraryApp {

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

    }
}
