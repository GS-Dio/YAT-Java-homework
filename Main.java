public class Main {


    public static void main(String[] args) {
        BookCollection collection = new BookCollection();

        collection.addBook(new Book("Book1", "Author1", "ISBN1"));
        collection.addBook(new Book("Book2", "Author2", "ISBN2"));
        collection.addBook(new Book("Book3", "Author3", "ISBN3"));

        System.out.println("Коллекция");
        for(Book book : collection.getBooks()){
            System.out.println(book);
        }

        Book bookRemove = collection.getBooks().get(0);
        collection.removeBook(bookRemove);

        System.out.println("Коллекция");
        for(Book book : collection.getBooks()){
            System.out.println(book);
        }
    }
}