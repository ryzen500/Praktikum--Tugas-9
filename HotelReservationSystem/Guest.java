// Guest.java
public class Guest {
    private String name;
    private Reservation reservation;

    // Konstruktor
    public Guest(String name) {
        this.name = name;
        this.reservation = null; // Opsional, bisa diatur nanti
    }

    // Getter untuk name
    public String getName() {
        return name;
    }

    // Getter dan Setter untuk reservation
    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
