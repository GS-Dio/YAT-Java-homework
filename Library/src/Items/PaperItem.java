package Items;

public interface PaperItem {
    void addBookmark(int page);
    void removeBookmark(int page);

    void writeNote(int page, String note);
    void eraseNote(int page);
    //Положить закладку
    //Написать заметку
}
