package Task2;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (0 <= hour && hour <= 23) {
            this.hour = hour;
        } else
            System.out.println("Error");
    }

    public void setMinute(int minute) {
        if (0 <= minute && minute <= 59) {
            this.minute = minute;
        } else
            System.out.println("Error");
    }

    public void setSecond(int second) {
        if (0 <= second && second <= 59)
            this.second = second;
        else
            System.out.println("Error");
    }
    public void setTime(int hour, int minute, int second){
        if (0 <= hour && hour <= 23) {
            this.hour = hour;
        } else
            System.out.println("Error");
        if (0 <= minute && minute <= 59) {
            this.minute = minute;
        } else
            System.out.println("Error");
        if (0 <= second && second <= 59)
            this.second = second;
        else
            System.out.println("Error");
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

    public Time nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
        }
        return this;
    }

    public Time previousSecond() {
        second--;
        if (second == -1) {
            second = 59;
        }
        return this;
    }

}
