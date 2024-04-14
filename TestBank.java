public class TestBank {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Add
        Account account1 = new Account(1, 1000);
        Account account2 = new Account(2, 2000);
        bank.addAccount(account1);
        bank.addAccount(account2);


        bank.deposit(1, 500);
        bank.withdraw(2, 300);

    }
}
