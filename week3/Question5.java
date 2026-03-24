package week3;

class BankAccount {
    double balance = 1000.0;

    void depositMoney(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited: " + amount);
        System.out.println("New balance: " + balance);
    }

    void withdrawMoney(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Error: Not enough money.");
            System.out.println("Current balance: " + balance);
        }
    }
}

public class Question5 {

    public static void main(String[] args) {
        
        BankAccount myAcc = new BankAccount();
        
        myAcc.depositMoney(250.50);
        myAcc.withdrawMoney(100.0);
        myAcc.withdrawMoney(2000.0);

    }

}