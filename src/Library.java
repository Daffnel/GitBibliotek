import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bokLista = new ArrayList<>();

    public Library(String title, String author; int pages){

    }

    public void addBook(Book book){

        bokLista.add(book);

    }

    public void printAllBooks(){

        for(int i = 0; i < bokLista.size();i++){
            System.out.println(bokLista);
        }

    }

    @Override
    public String toString() {
        return "Library{" +
                "bokLista=" + bokLista +
                ", pages=" + pages +
                '}';
    }
}
