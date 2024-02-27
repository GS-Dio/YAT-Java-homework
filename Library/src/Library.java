import Items.Book;
import Items.BorrowableItem;
import Items.DVD;
import Items.Magazin;
import Stage1.Librarian;
import Stage1.Member;
import org.w3c.dom.ls.LSOutput;

import javax.imageio.stream.ImageInputStream;
import java.io.Serializable;
import java.util.List;

public class Library implements Serializable {
    private Librarian[] libraries;
    private Member[] members; // Список посетителей
    private Book[] books; // Список книг
    private DVD[] dvds; // Список двд
    private Magazin[] magazins; // Список журналов

    private Book[] BorrowableBooks;
    private DVD[] BorrowableDVD;
    private Magazin[] BorrowableMagazin;

    public Library(Librarian[] libraries, Member[] members, Book[] books, DVD[] dvds, Magazin[] magazins) {
        this.libraries = libraries;
        this.members = members;
        this.books = books;
        this.dvds = dvds;
        this.magazins = magazins;
    }

    public Library() {
    }
    //-----------------------------Списки  --------------------------------------\\

    public void ListItems() {
        int nums = 0;
        for (int i = 0; i < books.length; i++) {
            System.out.println(nums + 1 + "." + books[i].toString());
            nums++;
        }
        System.out.println();
        for (int i = 0; i < dvds.length; i++) {
            System.out.println(nums + 1 + "." + dvds[i].toString());
            nums++;
        }
        System.out.println();
        for (int i = 0; i < magazins.length; i++) {
            System.out.println(nums + 1 + "." + magazins[i].toString());
            nums++;
        }
    }

    public void ListBooks() {
        int nums = 0;
        for (int i = 0; i < books.length; i++) {
            System.out.println(nums + 1 + "." + books[i].toString());
            nums++;
        }
    }


    public void ListMagazins() {
        int nums = 1;
        for (Magazin magazin : magazins) {
            System.out.println(nums + "." + magazin.toString());
            nums++;
        }
    }

    public void ListDvds() {
        int nums = 1;
        for (DVD dvd : dvds) {
            System.out.println(nums + "." + dvd.toString());
            nums++;
        }
    }

    //--------------------------------------Одолжить предмет------------------------------------------\\
    public void lendItem(int index, String WhoTakeIt) {

        if (index + 1 <= books.length) {
            lendBook(index, WhoTakeIt);

        } else if (index + 1 <= dvds.length + books.length) {
            lendDvd(index - books.length, WhoTakeIt);

        } else if (index + 1 <= magazins.length + dvds.length + books.length) {
            lendMagazin(index - books.length - dvds.length, WhoTakeIt);

        } else
            System.out.println("Не удалось одолжить предмет");
    }


    public void returnItem(int index, String WhoTakeIt) {
        for (Member member : members) {
            if (member.getLogin().equals(WhoTakeIt)) { //Проверка на пользователя
                BorrowableItem item = member.getOneBorrowedItem(index);

                if (item instanceof Book) { //Если предмет obj этого класса тогда
                    Book book = (Book) item;
                    book.returnMyItem(WhoTakeIt);

                } else if (item instanceof DVD) { //Если предмет obj этого класса тогда
                    DVD dvd = (DVD) item;
                    dvd.returnMyItem(WhoTakeIt);

                } else if (item instanceof Magazin) { //Если предмет obj этого класса тогда
                    Magazin magazin = (Magazin) item;
                    magazin.returnMyItem(WhoTakeIt);

                }
                member.removeBorrowableItem(index); //Уберем предмет
                return;
            }
        }
    }


    public void lendBook(int index, String WhoTakeIt) {
        if (books[index].getIsAvailable()) {
            books[index].lendMyItem(WhoTakeIt);

            boolean foundMember = false;
            for (int i = 0; i < members.length; i++) {

                if (WhoTakeIt.equals(members[i].getLogin()) && members[i].getIsActive()) {  // Если пользователь с таким логином и если он активен берет предмет
                    members[i].addBorrowableItem(books[index]); // то этот предмет добовляется в его аккаунт

                    foundMember = true;
                    break;
                }
            }
            if (!foundMember) {
                System.out.println("У пользователя не достаточно прав, оборотитесь к библиотекарю.");
            }
        } else
            System.out.println("Предмет уже одолжен");
    }

    public void lendDvd(int index, String WhoTakeIt) {
        if (dvds[index].getIsAvailable()) {
            boolean foundMember = false;
            dvds[index].lendMyItem(WhoTakeIt);

            for (int i = 0; i < members.length; i++) {

                if (WhoTakeIt.equals(members[i].getLogin()) && members[i].getIsActive()) {  // Если пользователь с таким логином берет предмет
                    members[i].addBorrowableItem(dvds[index]); // то этот предмет добовляется в его аккаунт

                    foundMember = true;
                    break;
                }
            }
            if (!foundMember) {
                System.out.println("У пользователя не достаточно прав, оборотитесь к библиотекарю.");
            }
        }
    }

    public void lendMagazin(int index, String WhoTakeIt) {
        if (magazins[index].getIsAvailable()) {
            boolean foundMember = false;
            magazins[index].lendMyItem(WhoTakeIt);

            for (int i = 0; i < members.length; i++) {

                if (WhoTakeIt.equals(members[i].getLogin()) && members[i].getIsActive() ) {  // Если пользователь с таким логином берет предмет
                    members[i].addBorrowableItem(magazins[index]); // то этот предмет добовляется в его аккаунт

                    foundMember = true;
                    break;
                }
            }
            if (!foundMember) {
                System.out.println("У пользователя не достаточно прав, оборотитесь к библиотекарю.");
            }
        }
    }

    public void showItems(String memberLogin) {  //Список одолженных предметов
        for (Member member : members) {
            if (member.getLogin().equals(memberLogin)) { // если пользователь с таким логином есть тогда
                System.out.println("Вы одолжили:");
                List<BorrowableItem> borrowedItems = member.getBorrowedItems();
                if (borrowedItems.isEmpty()) { //Если массив пуст тогда
                    System.out.println("У вас нет одолженных предметов");
                } else {
                    for (int i = 0; i < borrowedItems.size(); i++) {
                        System.out.println((i + 1) + ". " + borrowedItems.get(i));
                    }
                }
                return;
            }
        }
        System.out.println("Member with login " + memberLogin + " not found.");
    }

    //------------------------------Информация о пользователе--------------------------------------\\
    public void memberInfo(String memberLogin) {
        for (Member member : members) {
            if (member.getLogin().equals(memberLogin)) {
                System.out.printf(member.toString());
            }
        }
    }

    //------------------------------Методы библиотекаря--------------------------------------\\
    public void infoOfMembers() {
        for (Member member : members) {
            System.out.println(member.toString());
            System.out.println("--------------------");
        }
    }

    public void listBorrowItem() {
        for (Member member : members) {
            member.showBorrowItem();
        }
    }

    public void listAllMembers() {
        int i = 1;
        for (Member member : members) {
            System.out.println(i + "." + member.getLogin());
            i++;
        }
    }

    public void listActivMembers() {
        for (int i = 0; i < members.length; i++) {
            if (members[i].getIsActive()) {
                System.out.println(i + 1 + "." + members[i].getLogin());

            }
        }
    }

    public void listDeActivMembers() {
        for (int i = 0; i < members.length; i++) {
            if (!members[i].getIsActive()) {
                System.out.println(i + 1 + "." + members[i].getLogin());
            }
        }
    }

    public void deActivateMember(int indexMember) {
        for (int i = 0; i < members.length; i++) {
            if (members[i].getIsActive() && indexMember == i) {
                members[i].deActivate();
                System.out.println(members[i].getIsActive());
            } else
                System.out.println("Деактивация не удалась");
        }
    }

    public void activateMember(int indexMember) {
        for (int i = 0; i < members.length; i++) {
            if (!members[i].getIsActive() && i == indexMember) {
                members[i].activate();
            }
        }
    }

    //------------------------------Геттеры и сеттеры--------------------------------------\\

    public Librarian[] getLibraries() {
        return libraries;
    }

    public void setLibraries(Librarian[] libraries) {
        this.libraries = libraries;
    }

    public Member[] getMembers() {
        return members;
    }

    public void setMembers(Member[] members) {
        this.members = members;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public DVD[] getDvds() {
        return dvds;
    }

    public void setDvds(DVD[] dvds) {
        this.dvds = dvds;
    }

    public Magazin[] getMagazins() {
        return magazins;
    }

    public void setMagazins(Magazin[] magazins) {
        this.magazins = magazins;
    }

}
