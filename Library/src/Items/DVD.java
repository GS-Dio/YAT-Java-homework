package Items;

public class DVD extends libraryItem implements BorrowableItem{
    private int runTime;

    public DVD(int runTime) {
        this.runTime = runTime;
    }

    public DVD(int id, String name, boolean isAvailable, int runTime) {
        super(id, name, isAvailable);
        this.runTime = runTime;
    }
    public void lendItem() {
        super.setAvailable(false);
    }

    @Override
    public void returnItem() {
        super.setAvailable(true);
    }
    public void displayDetails(){
        System.out.println("Id =" + getId() + ", name" + getName() + ", IsAvailable" + getIsAvailable());
    }
}
