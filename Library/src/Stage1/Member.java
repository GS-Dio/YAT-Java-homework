package Stage1;

import Items.BorrowableItem;

import java.util.Arrays;

public class Member extends User {
    private BorrowableItem[] BorrowableItem;
    boolean isActive;

    public Member(Items.BorrowableItem[] borrowableItem, boolean isActive) {
        BorrowableItem = borrowableItem;
        this.isActive = isActive;
    }

    public Member(int id, String login, String password, String name,String surname,String patronymic) {
        super(id, login, password, name,surname,patronymic);
        this.isActive = true;
    }

    public Items.BorrowableItem[] getBorrowableItem() {
        return BorrowableItem;
    }

    public void activate(){
        isActive = true;
    }
    public void deActivate(){
        isActive = false;
    }

    public void setBorrowableItem(Items.BorrowableItem[] borrowableItem) {
        BorrowableItem = borrowableItem;
    }

    public boolean getIsActive() {
        return isActive;
    }

    @Override
    public String toString() {
        return "Member{"+ "Full name: " + getName()+ "Login: " + getLogin()  + "BorrowableItem=" + Arrays.toString(BorrowableItem) + ", isActive=" + isActive + "} ";
        //Имя
        //Логин
        //Заимствованные предметы
        //Статус (Активен/ НеАктивен)
    }
}
