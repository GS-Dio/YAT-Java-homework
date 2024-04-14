import java.util.ArrayList;
import java.util.List;

public class Reservation {
    private List<Airplane> airplanes;
    private List<Hotel> hotels;
    private List<Booking> bookings;

    public Reservation(List<Airplane> airplanes, List<Hotel> hotels, List<Booking> bookings) {
        this.airplanes = airplanes;
        this.hotels = hotels;
        this.bookings = bookings;
    }

    public void searchAndBook(String clientName, String destination) {
        Airplane selectedAirplane = null;
        Hotel selectedHotel = null;

        for (Airplane airplane : airplanes) {
            if (airplane.getDestination().equalsIgnoreCase(destination)) {
                selectedAirplane = airplane;
                break;
            }
        }

        for (Hotel hotel : hotels) {
            if (hotel.getLocation().equalsIgnoreCase(destination)) {
                selectedHotel = hotel;
                break;
            }
        }

        if (selectedAirplane != null && selectedHotel != null) {
            Booking booking = new Booking(clientName, selectedAirplane, selectedHotel, destination);
            bookings.add(booking);
            System.out.println("Бронирование успешно завершено: " + booking);
        } else {
            System.out.println("Не удалось найти подходящий самолет и/или отель для пункта назначения: " + destination);
        }


    }
}
