// Kelas untuk merepresentasikan entitas Movie
public class Movie {
    private String title;
    private int duration;
    private String rating;

    // Konstruktor
    public Movie(String title, int duration, String rating) {
        this.title = title;
        this.duration = duration;
        this.rating = rating;
    }

    // Getter untuk title
    public String getTitle() {
        return title;
    }

    // Getter untuk duration
    public int getDuration() {
        return duration;
    }

    // Getter untuk rating
    public String getRating() {
        return rating;
    }
}
