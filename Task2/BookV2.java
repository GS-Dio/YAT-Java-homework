package Task2;

public class BookV2 {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public BookV2(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public BookV2(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }
    public Author[] getAuthors() {
        return  authors;
    }
    public double getPrice() {
        return price;
    }
    public int getQty() {
        return qty;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAutorNames(){
        return authors[0].getName() + authors[1].getName();
    }


    public String toString() {

        String autorInfo = " ";
        for (int i = 0; i > authors.length; i++){
            autorInfo = authors[i].toString();
        }
        return "Book[name = " + name + authors[0].getName() +   "price = " + price + "qty " + qty + "]";
    }

    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

// Declare and allocate a Book instance
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // toString()
    }
}
