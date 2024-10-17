import java.util.ArrayList;

public class Library {

  private ArrayList<Book> bokLista = new ArrayList<>();
  private ArrayList<NonFictionBook> nonFictionList = new ArrayList<>();
  private ArrayList<FictionBook> fictionList = new ArrayList<>();

   public Library(){}



    public void addNonFictionBook(NonFictionBook nfbook){

       nonFictionList.add(nfbook);
    }

    public void addFictionBook(FictionBook fbook){

       fictionList.add(fbook);
    }

    public  void addBook(Book book){

        bokLista.add(book);

    }

    public  void printAllBooks(){

        for (Book book : bokLista) {
            System.out.println(book);
        }

    }

}
