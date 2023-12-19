package Lesson2_task;

public class Book {
    private String title;
    private Author author;
    private int publicationYear;

    Book() {
        this.title = "null";
        this.publicationYear = 0;
    }

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public Author getAuthor() {
        return author;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public String getTitle() {
        return title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book { " +
                "Название = '" + title + '\'' +
                ", Год выпуска = " + publicationYear +
                ",'" + author + ' ' +
                '}';
    }
}
