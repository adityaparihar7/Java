import java.util.Scanner;

public class BankDetails {
   public static void main(String[] args){

   private String accno;
    private String name;
    private String acc_type;
   private long balance;
   Scanner sc = new Scanner(System.in);
 
   // method to open new account
 public static void openAccount() {
      System.out.print("Account No: ");
      accno = sc.nextLine();
      System.out.print("Account type: ");
      acc_type = sc.nextLine();
      System.out.print("Name: ");
      name = sc.nextLine();
      System.out.print("Balance: ");
      balance = sc.nextLong();
   }

   // method to display account details
    void showAccount() {
      System.out.println("Name: " + name);
      System.out.println("Account no.: " + accno);
      System.out.println("Account type: " + acc_type);
      System.out.println("Balance: " + balance);
   }

   // method to deposit money
 void deposit() {
      long amt;
      System.out.println("Enter the amount you want to deposit: ");
      amt = sc.nextLong();
      balance = balance + amt;
      System.out.println("Total balance after deposit is:" + balance);
   }

   // method to withdraw money
 void withdrawal() {
      long amt;
      System.out.println("Enter the amount you want to withdraw: ");
      amt = sc.nextLong();
      if (balance >= amt) {
         balance = balance - amt;
         System.out.println("Balance after withdrawal: " + balance);
      } else {
         System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!");
      }
   }

   // method to search an account number
   boolean search(String ac_no) {
      if (accno.equals(ac_no)) {
         showAccount();
         return (true);
      }
      return (false);
   }
}

public class BankingApp {
   public static void main(String arg[]) {
      Scanner sc = new Scanner(System.in);
      // create initial accounts
      int n;
      System.out.print("Enter number of customers: ");
      n = sc.nextInt();
      BankDetails C[] = new BankDetails[n];
      for (int i = 0; i < C.length; i++) {
         C[i] = new BankDetails();
         System.out.print("Enter details of " + (i + 1) + "\n");
         C[i].openAccount();
      }
      // loop runs until number 5 is not pressed to exit
      int choice;
      do {
         System.out.println("\n **Banking System Application**");
         System.out.println(
               "1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");
         System.out.println("Enter your choice: ");
         choice = sc.nextInt();
         switch (choice) {
            case 1:
               for (int i = 0; i < C.length; i++) {
                  C[i].showAccount();
               }
               break;
            case 2:
               System.out.print("Enter account no. you want to search: ");
               String ac_no = sc.next();
               boolean found = false;
               for (int i = 0; i < C.length; i++) {
                  found = C[i].search(ac_no);
                  if (found) {
                     break;
                  }
               }
               if (!found) {
                  System.out.println("Search failed! Account doesn't exist..!!");
               }
               break;
            case 3:
               System.out.print("Enter Account no. : ");
               ac_no = sc.next();
               found = false;
               for (int i = 0; i < C.length; i++) {
                  found = C[i].search(ac_no);
                  if (found) {
                     C[i].deposit();
                     break;
                  }
               }
               if (!found) {
                  System.out.println("Search failed! Account doesn't exist..!!");
               }
               break;
            case 4:
               System.out.print("Enter Account No : ");
               ac_no = sc.next();
               found = false;
               for (int i = 0; i < C.length; i++) {
                  found = C[i].search(ac_no);
                  if (found) {
                     C[i].withdrawal();
                     break;
                  }
               }
               if (!found) {
                  System.out.println("Search failed! Account doesn't exist..!!");
               }
               break;
            case 5:
               System.out.println("See you soon...");
               break;
         }
      } while (choice != 5);
   }
}
