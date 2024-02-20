package Items;

public interface PaperItem {
    void addBookmark(int page);
    void removeBookmark(int page);

    void WriteNote(int page,String note);
    void EraseNote(int page);
    //Положить закладку
    //Написать заметку
}
