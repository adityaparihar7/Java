
import java.util.Scanner;

public class while_loop_example {
    public static void main(String[] args) {
        // int i=1;
        // while(i<=25){

        // System.out.println("Aditya");
        // i=i+1;
        // }

        // program for input from user and get and get sum of first n natural numbers

        // Scanner s= new Scanner(System.in);
        // int n= s.nextInt();
        // int sum=0;
        // int i =1;
        // while(i<=n){
        // sum= sum+i;
        // i=i+1;
        // }
        // System.out.println(sum);

        // taking input from user and only printing out odd number skiping even number

        // Scanner s= new Scanner(System.in);
        // int n= s.nextInt();
        // int i=1;
        // while(i<=n){
        // if(i%2==0)
        // System.out.println(" ");
        // else
        // System.out.println(i);
        // i++;
        // }

        // taking input from the user getting power
        // Scanner s= new Scanner(System.in);
        // int n= s.nextInt();
        // int power= s.nextInt();
        // int i=1;
        // int ans=1;
        // while (i<=power) {
        // ans=ans*n;
        // i++;

        // }
        // System.out.println(ans);

        // find number of digits in the given number by logic of dividing number by 10

        // Scanner s= new Scanner(System.in);
        // int n=s.nextInt();
        // int count=0;
        // while (n>0){
        // n=n/10;
        // count++;

        // }
        // System.out.println("number of digit in the given number "+count);

        // getting sum of number entered

        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();

        // int sum = 0;
        // while (n > 0) {

        // sum = sum + n % 10;
        // n = n / 10;
        // }
        // System.out.println(sum);

        // finding factors of number entered by user
        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        // int factors = 2;
        // while (factors < n) {

        // if (n % factors == 0) {
        // System.out.println(factors);
        // }

        // factors++;

        // }

        // to check whether the number is prime or not

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 2;

        while (i < n) {
            if (n % i == 0) {
                System.out.println("your number is composite");
                return ;
                // stops the execution of program
                // if we use break it will only exit us out of the loop
                // if we use continue it will go back to starting of the loop

            }
            i++;
        }
        System.out.println("number is prime " + n);

    }

}
