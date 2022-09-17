import java.util.Scanner;

public class functions {

    public static void main(String[] args) {
        // calculating combination formula in factorial
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int r= s.nextInt();

        int factn= fact(n);
        int factnr=fact(n-r);
        int factr=fact(r);
        int ncr = factn/(factnr*factr);
        System.out.println(ncr);
        
        
        
    }
    public static int fact(int x) {
        int ans=1;
        int i=1;
        while(i<=x){
            ans=ans*i;
            i++;
        }
        
        return ans;
    }
    
}
