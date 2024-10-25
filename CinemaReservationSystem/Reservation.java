// Kelas untuk merepresentasikan entitas Reservation
public class Reservation {
    private String reservationId;
    private Movie movie;
    private Seat seat;

    // Konstruktor
    public Reservation(String reservationId, Movie movie, Seat seat) {
        this.reservationId = reservationId;
        this.movie = movie;
        this.seat = seat;
    }

    // Metode untuk memesan kursi
    public boolean reserveSeat() {
        if (seat.isAvailable()) {
            seat.setAvailability(false);
            return true;
        } else {
            System.out.println("Kursi " + seat.getSeatNumber() + " sudah dipesan.");
            return false;
        }
    }

    // Getter untuk reservationId
    public String getReservationId() {
        return reservationId;
    }

    // Getter untuk movie
    public Movie getMovie() {
        return movie;
    }

    // Getter untuk seat
    public Seat getSeat() {
        return seat;
    }
}
