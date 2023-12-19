package Lesson0;

public class Book {
    public String title;
    public String author;
    public int year;

   Book(){
        this.title = "null";
        this.author = "null";
        this.year = 0;
    }

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;

    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {
        Book dog = new Book();
        System.out.println(dog.toString());

        Book catAndStar = new Book("CAt and Stars", "Adi", 1);
        System.out.println(catAndStar.toString());
    }
}
