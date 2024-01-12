package Task1;

public class Candidate {
    private String name;
    private String work;
    private int income;

    public Candidate(String name,String work, int income){
        this.name = name;
        this.work = work;
        this.income = income;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getWork() {
        return work;
    }
    public void setWork(String work) {
        this.work = work;
    }
    public int getIncome() {
        return income;
    }
    public void setIncome(int income) {
        this.income = income;
    }

    public void rules(){
        String[] words = name.split(" ");
        String name = words[0];
        String surname = words[1];

        if (!work.equals("banker")){
            if (income >= 1000){
                if (!surname.equals("Johnson")){
                    if (!surname.equals("Edisson")){
                        System.out.println(name + surname);
                    }
                }
            }
        }
    }

    public String toString() {
        return name + " " + work + " " + income;
    }

    public static void main(String[] args) {
        Candidate first = new Candidate("James Clark" , "banker", 5000);
        Candidate second = new Candidate("Edvin Johnson","architect" ,3000);
        Candidate third = new Candidate("Katty Wesley","designer",5500);
        Candidate fourth = new Candidate("Bread Pitt", "cooker",3000);
        Candidate fifth = new Candidate("Jane Edisson","scientist",2500);
        Candidate sixth = new Candidate("William Johnson","banker",1100);
        Candidate seventh = new Candidate("Askar Balgabek","dianolicisonist", 10);
        Candidate eighth = new Candidate("Liam Turvey","designer ", 6500);

        first.rules();
        second.rules();
        third.rules();
        fourth.rules();
        fifth.rules();
        sixth.rules();
        seventh.rules();
        eighth.rules();
    }
}
