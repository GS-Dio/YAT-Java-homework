package Task4;

public class TestPerson {
    public static void main(String[] args) {
        Student student = new Student("Alex", "Tole by 1", "MAth", 2002, 1200.2);
        System.out.println(student.toString());

        Staff staff = new Staff("Biba", "Abaya 65","Kaldayakova 67", 67000.12);
        System.out.println(staff);
    }
}
