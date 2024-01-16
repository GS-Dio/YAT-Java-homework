package Task3;

public class TestAccount {
    public static void main(String[] args) {
        // Создаем клиента
        Customer customer = new Customer(1, "John Doe", 'M');

        // Создаем счет
        Account account = new Account(1001, customer, 500.0);

        // Выводим информацию о счете
        System.out.println("Initial Account Info:");
        System.out.println(account);

        // Делаем несколько операций с счетом
        account.deposit(200.0).withdraw(50.0);

        // Выводим обновленную информацию о счете
        System.out.println("\nUpdated Account Info:");
        System.out.println(account);

        // Создаем еще один счет с другим клиентом
        Customer anotherCustomer = new Customer(2, "Jane Doe", 'F');
        Account anotherAccount = new Account(1002, anotherCustomer, 1000.0);

        // Выводим информацию о новом счете
        System.out.println("\nAnother Account Info:");
        System.out.println(anotherAccount);
    }
}