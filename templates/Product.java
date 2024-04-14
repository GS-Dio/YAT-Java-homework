    package templates;

    public class Product {
        public static final String ANSI_RESET = "\u001B[0m";  // <-- Reset обрывает
        public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_YELLOW = "\u001B[33m";

        private String name;
        private double price;
        private double rating;

        public Product(String name, double price, double rating) {
            this.name = name;
            this.price = price;
            this.rating = rating;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getRating() {
            return rating;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }

        @Override
        public String toString() {
            return  name + " price: " + price + ANSI_GREEN + "$" + ANSI_RESET + " rating: " + rating + ANSI_YELLOW + "✩" + ANSI_RESET;
        }
    }
    //  name + "price: " + price + "rating: " + rating