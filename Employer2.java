import java.time.LocalDate;
import java.time.Period;

public class Employer2 {
    private String name;
    private int salary;
    private LocalDate hireDate;

    public Employer2(String name, int salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public int calculateYearOfWork(){
        LocalDate today  = LocalDate.now();
        Period period = Period.between(hireDate, today);
        return period.getYears();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employer2{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                '}';
    }

    public static void main(String[] args) {
        // Пример использования класса Employee
        LocalDate hireDate = LocalDate.of(2010, 5, 15);
        Employer2 employee = new Employer2("Иван", 50000, hireDate);

        System.out.println("Имя: " + employee.getName());
        System.out.println("Зарплата: " + employee.getSalary());
        System.out.println("Дата приема на работу: " + employee.getHireDate());
        System.out.println("Стаж работы: " + employee.calculateYearOfWork());
    }


}
