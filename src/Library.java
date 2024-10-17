import java.util.ArrayList;

public class Library {

  private ArrayList<Book> bokLista = new ArrayList<>();

   public Library(){}


    public  void addBook(Book book){

        bokLista.add(book);

    }

    public  void printAllBooks(){

        for (Book book : bokLista) {
            System.out.println(book);
        }

    }

}
