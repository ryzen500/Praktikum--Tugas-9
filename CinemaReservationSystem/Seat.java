// Kelas untuk merepresentasikan entitas Seat
public class Seat {
    private String seatNumber;
    private boolean isAvailable;

    // Konstruktor
    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
        this.isAvailable = true; // Kursi default tersedia
    }

    // Getter untuk seatNumber
    public String getSeatNumber() {
        return seatNumber;
    }

    // Memeriksa ketersediaan kursi
    public boolean isAvailable() {
        return isAvailable;
    }

    // Mengatur status ketersediaan kursi
    public void setAvailability(boolean available) {
        this.isAvailable = available;
    }
}
