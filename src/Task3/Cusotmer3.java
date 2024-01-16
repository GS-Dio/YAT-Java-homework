package Task3;

public class Cusotmer3 {
    private int id;
    private String name;
    private Gender gender;

    public Cusotmer3(int id, String name, Gender gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + " (" + id + ")";
    }
}
