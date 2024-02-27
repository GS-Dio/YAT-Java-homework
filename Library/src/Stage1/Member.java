package Stage1;

import Items.BorrowableItem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Member extends User implements Serializable {
    private List<BorrowableItem> borrowedItems;
    boolean isActive;

    public Member(int id, String login, String password, String name,String surname,String patronymic) {
        super(id, login, password, name,surname,patronymic);
        this.isActive = true;
        this.borrowedItems = new ArrayList<>();

    }
    public void showBorrowItem(){
        System.out.println(getLogin()+ ":");
        for (BorrowableItem borrowableItem: borrowedItems){
            if (!borrowedItems.isEmpty()) {
                System.out.println(borrowableItem);
            }else
                System.out.println("Пока ничего не одолжил.");
        }
    }

    public void activate(){
        isActive = true;
    }
    public void deActivate(){
        isActive = false;
    }

    public List<BorrowableItem> getBorrowedItems() {
        return borrowedItems;
    }
    public BorrowableItem getOneBorrowedItem(int index){
        return borrowedItems.get(index);
    }
    public void addBorrowableItem(BorrowableItem item) {
        borrowedItems.add(item);
    }

    public void removeBorrowableItem(int index) {
        borrowedItems.remove(index);
    }

    public boolean getIsActive() {
        return isActive;
    }

    @Override
    public String toString() {
        return  "Name: " + getName()  +"\nLogin: " + getLogin() + "\nОдолженных предметов:" + borrowedItems.size();
        //Имя
        //Логин
        //Заимствованные предметы
        //Статус (Активен/ НеАктивен)
    }
}
