package Lesson2_task;

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library(10);

        Author Matt = new Author("Matt Haig", "Великобритания");
        Book book1 = new Book("The Midnight Library", Matt, 2020);

        Author Kristin = new Author("Kristin Hannah", "USA");
        Book book2 = new Book("The Four Winds", Kristin, 2021);

        Author Dante = new Author("Dante Alegiery","Италия");
        Book book3 = new Book("The Sanatorium", Dante, 2021);

        Author Sarah = new Author("Sarah Pearse,"," Великобритания");
        Book book4 = new Book("The Sanatorium", Dante, 2021);

        Author Kate = new Author("Kate Quinn,"," США");
        Book book5 = new Book("The Rose Code", Dante, 2020);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        library.displayBooks();
    }
}
