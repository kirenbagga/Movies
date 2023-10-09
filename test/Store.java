import java.util.ArrayList;

public class Store {
    private ArrayList<Book> books;

    public Store(){
        this.books=new ArrayList<Book>();
        
    }
    public Book getBook(int index){
        return new Book(this.books.get(index));

    }
    public void setBook(int index,Book newBook){
        this.books.set (index, new Book(newBook));
    }
    public void addBook(Book adddBook){
        this.books.add(new Book(adddBook));
    }
    public boolean containsBook(Book  book){
        return this.books.contains(book);
    }
    public  void sellBook(String titleName){
        for (int i = 0; i < this.books.size(); i++) {
            if(this.books.get(i).getTitle().equals(titleName)){
                this.books.remove(i);
            }
            
        }


    }

    
}
