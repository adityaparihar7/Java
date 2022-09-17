import java.util.Scanner;

import com.apple.laf.AquaMenuBarBorder;

public class BankingApplication {
    public static void main(String[] args) {

    }

}

class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerid;

    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;

        }

    }

    void getpreviousTransaction() {
        balance=balance - ;

    }

}
