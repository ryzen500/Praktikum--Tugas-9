// HotelReservationSystem.java
public class HotelReservationSystem {
    public static void main(String[] args) {
        // Membuat room dan guest
        Room room1 = new Room("101", 120.00);
        Guest guest1 = new Guest("John Doe");

        // Membuat reservasi
        Reservation reservation = new Reservation(room1, guest1, 3);
        guest1.setReservation(reservation);

        // Menampilkan detail reservasi dan total harga
        System.out.println("Total Harga Reservasi: " + reservation.calculateTotalPrice());
    }
}
