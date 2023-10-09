public class  StoreBookMain{

    public static void main(String[] args) {
        Book book1=new Book("kill","ake",32.1,2.3);
        Book book2=new Book("Bill","bkb",31.1,1.3);
        
        Store store=new Store();
        store.addBook(book1);
        store.addBook(book2);
        
        //test getBook method
        Book retrieveBook=store.getBook(0);
        System.out.println(retrieveBook.getTitle());

        //test the setBook method
        Book newBook=new Book("Pandey","ckc",12.1,2.3);
        store.setBook(0, newBook);
        //verify book was updated
        retrieveBook=store.getBook(0);
        System.out.println(retrieveBook.getTitle());

        //test the contains method
        System.out.println(store.containsBook(book2));

        store.sellBook("Pandey");


    }
}