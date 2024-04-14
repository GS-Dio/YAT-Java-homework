import java.util.ArrayList;
import java.util.List;

public class ReservationTest {

        public static void main(String[] args) {
            List<Airplane> airplanes = new ArrayList<>();
            airplanes.add(new Airplane(101, "Paris"));
            airplanes.add(new Airplane(202, "London"));
            airplanes.add(new Airplane(303, "New York"));


            List<Hotel> hotels = new ArrayList<>();
            hotels.add(new Hotel("Hotel Alla", "Paris"));
            hotels.add(new Hotel("Hotel Bravo", "London"));
            hotels.add(new Hotel("Hotel City", "New York"));


            List<Booking> bookings = new ArrayList<>();

            Reservation agency = new Reservation(airplanes, hotels, bookings);


            System.out.println("Test 1:");
            agency.searchAndBook("John", "Paris");

            System.out.println("Test 2:");
            agency.searchAndBook("Alice", "London");

            System.out.println("Test 3:");
            agency.searchAndBook("Bob", "Tokyo");
        }


}
