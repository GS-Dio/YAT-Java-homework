package Stage1;

import java.io.Serializable;

public class Librarian extends User implements Serializable {
    private int workExperiance;
    private boolean isActive;

    public Librarian(int id, String login, String password, String name, String surname, String patronymic, int workExperiance) {
        super(id, login, password, name, surname, patronymic);
        this.workExperiance = workExperiance;
        isActive = true;
    }


    public int getWorkExperiance() {
        return workExperiance;
    }

    public void activate() {
        isActive = true;
    }

    public void deActivate() {
        isActive = false;
    }

    public void setWorkExperiance(int workExperiance) {
        this.workExperiance = workExperiance;
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "workExperiance=" + workExperiance +
                "} " + super.toString();
    }
}
