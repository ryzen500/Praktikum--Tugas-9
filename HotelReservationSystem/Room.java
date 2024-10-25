// Room.java
public class Room {
    private String roomNumber;
    private double pricePerNight;

    // Konstruktor
    public Room(String roomNumber, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.pricePerNight = pricePerNight;
    }

    // Getter untuk roomNumber
    public String getRoomNumber() {
        return roomNumber;
    }

    // Getter untuk pricePerNight
    public double getPricePerNight() {
        return pricePerNight;
    }
}
