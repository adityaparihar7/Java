
import java.util.Scanner;
public class inputfromuser {
     public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.println("give value of a");
    int a = s.nextInt();
    System.out.println("give value of b");
    double b = s.nextDouble();
    double sum = a+b;
    System.out.println("addition of a and b is "+sum);
     }


    
}
