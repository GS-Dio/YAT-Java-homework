import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank(){
        this.accounts =  new ArrayList<>();
    }

    public void addAccount(Account account){
        accounts.add(account);
    }
    public void removeAccount(Account account){
        accounts.remove(account);
    }

    public void deposit(int id,int amount){
      for (Account account : accounts){
          if (account.getId() == id){
              account.deposit(amount);
              return;
          }
      }
        System.out.println("Ошибка");
    }
    public void withdraw(int id,int amount){
        for(Account account : accounts) {
            if (account.getId() == id) {
                account.withdraw(amount);
                return;
            }
        }
    }
    public List<Account> getAccounts(){
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
