// Kelas utama untuk menjalankan sistem reservasi bioskop
public class CinemaReservationSystem {
    public static void main(String[] args) {
        // Membuat objek movie
        Movie movie = new Movie("Avengers", 180, "PG-13");

        // Membuat objek seat
        Seat seat = new Seat("A14");

        // Membuat reservasi
        Reservation reservation = new Reservation("R001", movie, seat);

        System.out.println("Kursi Tersedia ?  "+ reservation.reserveSeat());
    }
}
