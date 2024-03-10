package Items;

import java.io.Serializable;

public class DVD extends libraryItem implements BorrowableItem, Serializable {
    private int runTime;
    private String whoTakeIt;

    public DVD(int runTime) {
        this.runTime = runTime;
    }

    public DVD(int id, String name, boolean isAvailable, int runTime) {
        super(id, name, isAvailable);
        this.runTime = runTime;
    }

    public void lendMyItem(String WhoTakeIt) {
        super.setAvailable(false);
        this.whoTakeIt = WhoTakeIt;
    }

    @Override
    public void returnMyItem(String WhoTakeIt) {
        super.setAvailable(true);
        System.out.println("This book is already in the library");
    }

    public void displayDetails() {
        System.out.println("Id =" + getId() + ", name" + getName() + ", IsAvailable" + getIsAvailable());
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    public String getWhoTakeIt() {
        return whoTakeIt;
    }

    public void setWhoTakeIt(String whoTakeIt) {
        this.whoTakeIt = whoTakeIt;
    }

    @Override
    public String toString() {
        return "DVD[name:" + getName() +
                " runTime: " + runTime +
                ']';
    }
}
