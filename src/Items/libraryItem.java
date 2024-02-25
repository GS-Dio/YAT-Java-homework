package Items;

public abstract class libraryItem {
    private int id;
    private String name;
    private boolean isAvailable;

    public libraryItem() {
        id = 0;
        name = "null";
        isAvailable = false;
    }

    public libraryItem(int id, String name, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.isAvailable = isAvailable;
    }

    void displayDetails() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "libraryItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
