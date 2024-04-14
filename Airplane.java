import javax.swing.event.ListDataEvent;
import java.util.Date;

public class Airplane {
    private int flightNumber;
    private String destination;
    private Date departureTime;
    private boolean delayed;

    public Airplane(int flightNumber, String destination) {
        this.flightNumber = flightNumber;
        this.destination = destination;
    }
    public Airplane(int flightNumber, String destination, Date departureTime, boolean delayed) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.delayed = delayed;
    }

    public void isDelayed() {
        if(delayed){
            System.out.println("Yes he delayed");
        } else
            System.out.println("No he not delayed");

    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public void setDelayed(boolean delayed) {
        this.delayed = delayed;
    }

    public void Status() {
        if (delayed) {
            System.out.println("The flight " + flightNumber + " to " + destination + " is delayed.");
        } else {
            System.out.println("The flight " + flightNumber + " to " + destination + " is on time.");
        }
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "flightNumber=" + flightNumber +
                ", destination='" + destination + '\'' +
                ", departureTime=" + departureTime +
                ", delayed=" + delayed +
                '}';
    }
}
