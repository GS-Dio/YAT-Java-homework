import java.util.List;

public class Movie {
    private String title;
    private String director;
    private List<Actor> actors;
    private List<Review> reviews;

    public Movie(String title, String director, List<Actor> actors, List<Review> reviews) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = reviews;
    }

    public void addReview(Review review){
        reviews.add(review);
    }
    public void removeReview(Review review){
        reviews.remove(review);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public List<Review> getReviews() { // Получить рецензию
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", actors=" + actors +
                ", reviews=" + reviews +
                '}';
    }
}
