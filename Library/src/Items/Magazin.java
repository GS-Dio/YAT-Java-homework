package Items;

public class Magazin extends libraryItem implements BorrowableItem,PaperItem {


    private long issueNumber;
    private String issuer;

    public Magazin(){
        super();
        this.issueNumber = 0;
        this.issuer = "null";
    }

    public Magazin(int id, String name, boolean isAvailable, long issueNumber, String issuer) {
        super(id, name, isAvailable);
        this.issueNumber = issueNumber;
        this.issuer = issuer;
    }
    public void displayDetails(){
        System.out.println("Id =" + getId() + ", name" + getName() + ", IsAvailable" + getIsAvailable());
    }
    @Override
    public void addBookmark(int page) {
        System.out.println("Закладка добавлена на стр" + page);
    }

    @Override
    public void removeBookmark(int page) {
        System.out.println("Закладка убрана со стр" + page);
    }

    @Override
    public void WriteNote(int page,String note) {
        System.out.println("Заметка \"" + note + "\" добавлена на стр" + page);
    }

    @Override
    public void EraseNote(int page) {
        System.out.println("Заметка удалена со стр" + page);
    }
    @Override
    public void lendItem() {
        super.setAvailable(false);
    }

    @Override
    public void returnItem() {
        super.setAvailable(true);
    }

    public long getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(long issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }
}
