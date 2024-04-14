public class Booking {
    private String clientName;
    private Airplane airplane;
    private Hotel hotel;
    private String destination;

    public Booking(String clientName, Airplane airplane, Hotel hotel, String destination) {
        this.clientName = clientName;
        this.airplane = airplane;
        this.hotel = hotel;
        this.destination = destination;
    }

    public String getClientName() {
        return clientName;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "clientName='" + clientName + '\'' +
                ", airplane=" + airplane +
                ", hotel=" + hotel +
                ", destination='" + destination + '\'' +
                '}';
    }
}