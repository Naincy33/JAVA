class Cinema {
    int seats = 10;

    // synchronized method (easy way)
    synchronized void bookSeat(String user, int seatsWanted) {
        if (seats >= seatsWanted) {
            System.out.println(user + " booked " + seatsWanted + " seats");
            seats = seats - seatsWanted;
            System.out.println("Seats left: " + seats);
        } else {
            System.out.println(user + " ❌ not enough seats");
        }
    }
}

class User extends Thread {
    Cinema cinema;
    int seatsWanted;

    User(Cinema cinema, int seatsWanted, String name) {
        this.cinema = cinema;
        this.seatsWanted = seatsWanted;
        setName(name);
    }

    public void run() {
        cinema.bookSeat(getName(), seatsWanted);
    }
}

public class CinemaBooking {
    public static void main(String[] args) {

        Cinema cinema = new Cinema();

        User u1 = new User(cinema, 6, "User-1");
        User u2 = new User(cinema, 6, "User-2");

        u1.start();
        u2.start();
    }
}
