import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReservationHotel {

    private static class Reservation {
        String guestName;
        String roomType;
        int numberOfNights;

        public Reservation(String guestName, String roomType, int numberOfNights) {
            this.guestName = guestName;
            this.roomType = roomType;
            this.numberOfNights = numberOfNights;
        }

        @Override
        public String toString() {
            return "Guest Name: " + guestName + ", Room Type: " + roomType + ", Number of Nights: " + numberOfNights;
        }
    }

    public static void main(String[] args) {
        List<Reservation> reservations = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter guest name (or 'q' to quit): ");
            String guestName = scanner.nextLine();
            if (guestName.equalsIgnoreCase("q")) {
                break;
            }

            System.out.println("Enter room type (suite, king, double): ");
            String roomType = scanner.nextLine();

            System.out.println("Enter number of nights: ");
            int numberOfNights = scanner.nextInt();
            scanner.nextLine(); // Consume newline not consumed by nextInt()

            Reservation reservation = new Reservation(guestName, roomType, numberOfNights);
            reservations.add(reservation);
        }

        System.out.println("\nReservation Summary:");
        for (Reservation reservation : reservations) {
            System.out.println(reservation);
        }
    }
}