package Task1;

public class Plane {
    private String id;
    private String arrivalTme;
    private String leaveTime;

    public Plane(String id, String arrivalTime, String leaveTime) {
        this.id = id;
        this.arrivalTme = arrivalTime;
        this.leaveTime = leaveTime;
    }

    public String getId() {
        return id;
    }
    public String getArrivalTme() {
        return arrivalTme;
    }
    public String getLeaveTime() {
        return leaveTime;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setArrivalTme(String arrivalTme) {
        this.arrivalTme = arrivalTme;
    }
    public void setLeaveTime(String leaveTime) {
        this.leaveTime = leaveTime;
    }

    public void moreThanTwoHours(){
        String[] num = arrivalTme.split(":");
        String Hour = num[0];
        String Min = num[1];

        String[] num2 = leaveTime.split(":");
        String Hour2 = num2[0];
        String Min2 = num2[1];

        int a = Integer.parseInt(Hour)*60 + Integer.parseInt(Min);
        int b = Integer.parseInt(Hour2)*60 + Integer.parseInt(Min2);

        if(b - a > 120)
            System.out.println(toString());
    }

    @Override
    public String toString() {
        return id + " " + arrivalTme + " " + leaveTime;
    }

    public static void main(String[] args) {
        Plane firstFlight = new Plane("ABS", "12:05", "12:45");
        Plane secondFlight = new Plane("FDR", "12:00", "12:30");
        Plane thirdFlight = new Plane("DWE", "15:20", "18:40");
        Plane fourthFlight = new Plane("OYH", "12:00", "12:10");
        Plane sixthFlight = new Plane("LQW", "15:20", "17:50");
        Plane seventhFlight = new Plane("LQW", "15:20", "17:50");
        Plane eighthFlight = new Plane("LQW", "15:20", "17:50");

        firstFlight.moreThanTwoHours();
        secondFlight.moreThanTwoHours();
        thirdFlight.moreThanTwoHours();
        fourthFlight.moreThanTwoHours();
        sixthFlight.moreThanTwoHours();
        seventhFlight.moreThanTwoHours();
        eighthFlight.moreThanTwoHours();
    }
}