package Items;


import java.io.Serializable;

public class Book extends libraryItem implements PaperItem, BorrowableItem, Serializable {

    private String author;
    private String title;
    private String isbn; //Штих код
    private String whoTakeIt;

    public Book() {
        super();
        author = "null";
        title = "null";
        isbn = "null";

    }

    public Book(int id, String name, boolean isAvailable, String author, String title, String isbn) {
        super(id, name, isAvailable);
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    @Override
    public void addBookmark(int page) {
        System.out.println("Закладка добавлена на стр" + page);
    }

    @Override
    public void removeBookmark(int page) {
        System.out.println("Закладка убрана со стр" + page);
    }

    @Override
    public void writeNote(int page, String note) {
        System.out.println("Заметка \"" + note + "\" добавлена на стр" + page);
    }

    @Override
    public void eraseNote(int page) {
        System.out.println("Заметка удалена со стр" + page);
    }

    @Override
    public void lendMyItem(String WhoTakeIt) {
            super.setAvailable(false);
            this.whoTakeIt = WhoTakeIt;
    }

    @Override
    public void returnMyItem(String WhoTakeIt) {
        if (!getIsAvailable() && WhoTakeIt.equals(this.whoTakeIt)) {
            super.setAvailable(true);
        }
    }

    public String getWhoTakeIt() {
        return whoTakeIt;
    }

    public void setWhoTakeIt(String whoTakeIt) {
        this.whoTakeIt = whoTakeIt;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book[author: " + author + ", title: " + title + ", isbn: " + isbn + "]";
    }
}
