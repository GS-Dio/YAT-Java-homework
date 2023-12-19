package Lesson2_task;

public class Employee1 {
    private int id; // id сотрудника
    private String firstName;
    private String lastName;
    private int salary; // зарплатa

    public Employee1(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getName(){
        return firstName + " " + lastName;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int annualSalary(){
        return salary * 12;
    }
    public int raiseSalary(int persent){
        salary = salary + (persent * salary) / 100;
        return salary;
    }
    public String toString(){
        return "Employee1 [" +
                "id" + id +
                "Name " + getName() +
                "Salary " + salary +
                "]";
    }

}
