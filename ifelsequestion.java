import java.util.Scanner;
// code to check if the first letter of string is capital or small with the help of ASCII value.
public class ifelsequestion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str= s.nextLine();
        char c= str.charAt(0);
        int x =c;

        if(x>=97 && x<=122){
            System.out.println(1);

        }
        else if( x>=65 && x<=90){
            System.out.println(0);
        }

        else {System.out.println(-1);
        }
        
    }

    
}
