import java.util.Scanner;
public class simpleinterest {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int p = s.nextInt();
        int r =s.nextInt();
        int t =s.nextInt();
        double SI= (double)(p*r*t)/100;
        System.out.println(+SI);
    }
    // int/int =int
    // double/int = double 
    // int/double = double
    // double /double =double
    // in division operator     and same for addition too
    

    
}
