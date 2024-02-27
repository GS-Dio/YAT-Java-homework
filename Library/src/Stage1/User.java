package Stage1;

import java.io.Serializable;

public abstract class User implements Serializable {
    private int id;
    private String login;
    private String password;
    private String[] name = new String[3];

    public User() {
        this.id = 0;
        this.login = "null";
        this.password = "null";
        this.name = new String[]{"null", "null", "null"};
    }

    public User(int id, String login, String password, String name,String surname,String patronymic) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = new String[]{name, surname, patronymic};
    }
    public abstract void activate();
    public abstract void deActivate();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {

        return name[0].concat(" ").concat(name[1]).concat(" ").concat(name[2]);
    }

    public void setName(String[] name) {
        this.name = name;
    }
}
