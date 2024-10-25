``` mermaid 
classDiagram
     direction RL
    class Movie {
        - String title
        - int duration
        - String rating
        + getTitle() String
        + getDuration() int
        + getRating() String
    }

    class Seat {
        - String seatNumber
        - boolean isAvailable
        + getSeatNumber() String
        + isAvailable() boolean
        + setAvailability(boolean available)
    }

    class Reservation {
        - String reservationId
        - Movie movie
        - Seat seat
        + reserveSeat() boolean
        + getReservationId() String
        + getMovie() Movie
        + getSeat() Seat
    }

    Movie <-- Reservation : reserves
    Seat <-- Reservation : includes



```