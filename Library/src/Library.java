import Items.Book;
import Items.BorrowableItem;
import Items.DVD;
import Items.Magazin;
import Stage1.Librarian;
import Stage1.Member;

import javax.imageio.stream.ImageInputStream;

public class Library {
    private Librarian[] libraries;
    private Member[] members; // Список посетителей
    private Book[] books; // Список книг
    private DVD[] dvds; // Список двд
    private Magazin [] magazins; // Список журналов

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

    public void ListItems(){
        for (int i = 0; i < books.length; i++){
            int numer = i;
            System.out.println(numer + 1 + "." + books[i].toString());
        }
    }

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
    public void lendBook(int index){
        books[index - 1].lendItem();
    }
    public void returnItem(int index){
        books[index].returnItem();
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
