package Task1;

public class Student2 {
    private String name;
    private double averageMark;
    private double scholarship;

    public Student2(String name,double averageMark, double scholarship){
        this.name = name;
        this.averageMark = averageMark;
        this.scholarship = scholarship;
    }

    public String getName() {
        return name;
    }
    public double getAverageMark() {
        return averageMark;
    }
    public double getScholarship() {
        return scholarship;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }

    public void changeScholarship(){
        if (averageMark >= 4.5)
            scholarship += scholarship*0.30;
        else if (averageMark > 2)
        scholarship += scholarship*0.10;
        System.out.println(name + " will take " + scholarship + "(" + averageMark + ")");
    }
    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", averageMark=" + averageMark +
                ", scholarship=" + scholarship +
                '}';
    }

    public static void main(String[] args) {
    Student2 Medet = new Student2("Medet", 3.5, 20000);
    Student2 Azamat = new Student2("Azamat",4.7, 20000);
    Student2 Ali = new Student2("Ali", 1.6,20000);
    Student2 Togzhan = new Student2 ("Togzhan", 2.9,20000);
    Student2 Aidana = new Student2("Aidana", 4.8,20000);

    Medet.changeScholarship();
    Azamat.changeScholarship();
    Ali.changeScholarship();
    Togzhan.changeScholarship();
    Aidana.changeScholarship();


    }
}
