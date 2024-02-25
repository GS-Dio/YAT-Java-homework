package Items;

public interface BorrowableItem {
    //Одолжить предмет
    //Вернуть предмет
    //Можно ли его одолжить

    void lendMyItem(String WhoTakeIt);
    void returnMyItem(String WhoTakeIt);
}
