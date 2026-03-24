package week3;

class SurajAccount extends BankAccount {
    String studentName;
    String regId;

    SurajAccount(String name, String id, double initialBal) {
        studentName = name;
        regId = id;
        balance = initialBal;
        
        System.out.println("Account initialized for: " + studentName);
        System.out.println("Registration ID: " + regId);
        System.out.println("Starting Balance: " + balance);
    }
}

public class Question7 {

    public static void main(String[] args) {
        
        SurajAccount myAcc = new SurajAccount("Suraj Poddar", "AIC-2026", 5000.0);
        
        System.out.println("--- Final Verification ---");
        System.out.println("Owner: " + myAcc.studentName);
        System.out.println("Balance: " + myAcc.balance);

    }

}