package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(1000);
        System.out.println("balance = " + account.getBalance());
    }
}
