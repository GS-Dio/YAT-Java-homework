package Lesson2_task;

public class Author {
    private String name;
    private String country;

    Author(){
        name = "null";
        country = "null";
    }
    public Author(String name, String country){
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }
    public String getCountry() {
        return country;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String toString(){
        return " Автор [" +
                "Имя = '" + name + "', " +
                "Страна  = '" + country + "'";
    }
}
