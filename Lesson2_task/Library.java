package Lesson2_task;

public class Library {
    private Book[] books;

    public Library(int size) {
        this.books = new Book[size];
    }

    public Book addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return book;
            }
        }
        System.out.println("В библиотеке нет мест");
        return null;
    }


    public void displayBooks() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null)
                System.out.println(i + 1 + " Книга " + books[i]);
        }
    }
}
