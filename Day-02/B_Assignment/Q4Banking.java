
class BankAccount {
    private String accNo;
    private String accHolderName;
    private double bal;

    public BankAccount(String accNo, String accHolderName, double initialBalance) {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.bal = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            bal += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= bal) {
            bal -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }

    public String getAccountNumber() {
        return accNo;
    }

    public void setAccountNumber(String accNo) {
        this.accNo = accNo;
    }

    public String getAccountHolderName() {
        return accHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accHolderName = accountHolderName;
    }

    public double getBalance() {
        return bal;
    }

    public void setBalance(double balance) {
        this.bal = balance;
    }

}

public class Q4Banking {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345678", "Aditya Ranjan Pradhan", 1000.0);

        account.deposit(500.0);
        account.withdraw(200.0);

        System.out.println("Current Balance: " + account.getBalance());
        account.setAccountHolderName("Aditya Ranjan Pradhan");
        System.out.println("Updated Account Holder: " + account.getAccountHolderName());
    }
}
