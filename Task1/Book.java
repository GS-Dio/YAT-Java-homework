package Task1;

public class Book {
    private String title;
    private String author;
    private double price;
    private String type;  /// may be “Simple”, “Classical”, “Bestseller”

    Book() {
        this.title = "null";
        this.author = "null";
        this.price = 0;
        this.type = "null";
    }
    public Book(String title, String author, double price, String type) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public void changePrice(){
        if(type.equals("Classical"))
            price -= price*0.10;
        else if (type.equals("Bestseller"))
            price += price*0.20;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return title + " " + author + " " + price + " " + type;
    }

    public static void main(String[] args) {
        Book firstBook = new Book("War_and_Peace ","Tolstoy", 5000, "Classical");
        Book secondBook = new Book("Kodzima_genius", "Wulf",8000 , "Bestseller");
        Book thirdBook = new Book("Hobbit ","Tolkien",9500 , "Classical");
        Book fourthBook = new Book("Potter","Rowling",10000,"Simple");

        firstBook.changePrice();
        secondBook.changePrice();
        thirdBook.changePrice();
        fourthBook.changePrice();
    }
}
