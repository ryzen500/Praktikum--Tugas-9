// Reservation.java
public class Reservation {
    private Room room;
    private Guest guest;
    private int numberOfNights;

    // Konstruktor
    public Reservation(Room room, Guest guest, int numberOfNights) {
        this.room = room;
        this.guest = guest;
        this.numberOfNights = numberOfNights;
    }

    // Menghitung total biaya reservasi
    public double calculateTotalPrice() {
        return room.getPricePerNight() * numberOfNights;
    }

    // Getter untuk room
    public Room getRoom() {
        return room;
    }

    // Getter untuk guest
    public Guest getGuest() {
        return guest;
    }

    // Getter untuk numberOfNights
    public int getNumberOfNights() {
        return numberOfNights;
    }
}
