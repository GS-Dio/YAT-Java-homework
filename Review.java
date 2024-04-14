public class Review {
    public String author;
    public String reviewText;

    public Review(String author, String reviewText) {
        this.author = author;
        this.reviewText = reviewText;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    @Override
    public String toString() {
        return "Review{" +
                "author='" + author + '\'' +
                ", reviewText='" + reviewText + '\'' +
                '}';
    }
}
