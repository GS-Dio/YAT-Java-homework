package Task2;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int day){
       if(day >= 1 && day <= 31) {
           this.day = day;
       }else {
           System.out.println("Некоректный ввод");
           this.day = 1;
       }
    }
    public void setMonth(int month){
        if(month >= 1 && month <= 12) {
            this.month = month;
        }else {
            System.out.println("Некоректный ввод");
            this.month = 1;
        }
    }
    public void setYear(int year){
        if(year >= 1900 && year <= 2024) {
            this.year = year;
        }else {
            System.out.println("Некоректный ввод");
            this.year = 1999;
        }

    }
    public void setDate (int day,int month,int year){
        if(day >= 1 && day <= 31) {
            this.day = day;
        }else {
            System.out.println("Некоректный ввод");
            this.day = 1;
        }
        if(month >= 1 && month <= 12) {
            this.month = month;
        }else {
            System.out.println("Некоректный ввод");
            this.month = 1;
        }
        if(year >= 1900 && year <= 2024) {
            this.year = year;
        }else {
            System.out.println("Некоректный ввод");
            this.year = 1999;
        }
    }
    public String toString(){
        return day +"/"+ month + "/"+year ;
    }

}
