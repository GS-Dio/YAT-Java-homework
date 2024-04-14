public class Book {

    private String title;
    private String author;
    private String ISBN;

    public Book(String title,String author, String ISBN){
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getISBN(){
        return ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }

}
