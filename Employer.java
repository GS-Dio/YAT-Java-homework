public class Employer {
    private String name;
    private String jobTitle;
    private int salary;

    public Employer(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void updateSalary(int newSalary){
        salary = newSalary;
    }
    public void calculateRaise(double percentage) {
        double raiseAmount = salary * percentage / 100;
        this.salary += raiseAmount;
    }

    public int getSalary(){
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
