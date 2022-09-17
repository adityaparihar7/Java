import java.util.Scanner;

public class pattern_using_while {
    //for printing stars in the order

    // public static void main(String[] args) {
    //     Scanner s = new Scanner(System.in);
    //     int n = s.nextInt();
    //     int j = 1;
    //     while (j <= n) {
    //         int i = 1;
    //         while (i <= n) {
    //             System.out.println("*");
    //             i = i + 1;
    //             }
    //         System.out.println();
    //         j = j + 1;


//will print 1111  2222 .....
    // public static void main(String[] args) {
    //     Scanner s = new Scanner(System.in);
    //     int n = s.nextInt();
    //     int j = 1;
    //     while (j <= n) {
    //         int i = 1;
    //         while (i <= n) {
    //             System.out.println(j);
    //             i = i + 1;
    //             }
    //         System.out.println();
    //         j = j + 1;

// will print 1234
    // public static void main(String[] args) {
    //     Scanner s = new Scanner(System.in);
    //     int n = s.nextInt();
    //     int j = 1;
    //     while (j <= n) {
    //         int i = 1;
    //         while (i <= n) {
    //             System.out.println(i);
    //             i = i + 1;
    //             }
    //         System.out.println();
    //         j = j + 1;


//for 1234 5678
    // public static void main(String[] args) {
    //     Scanner s = new Scanner(System.in);
    //     int n = s.nextInt();
    //     int k = 1;
    //     int j = 1;
        
    //     while (j <= n) {
    //         int i = 1;
    //         while (i <= n) {
    //             System.out.println(k);
    //             i = i + 1;
    //             k++;
    //             }
    //         System.out.println();
    //         j = j + 1;



    // public static void main(String[] args) {
    //     Scanner s = new Scanner(System.in);
    //     int n = s.nextInt();
    //     int i = 1;
    //     while (i <= n) {
    //         int j = 1;
    //         while (j <= i) {
    //             System.out.println("*");
    //             j = j + 1;
    //             }
    //         System.out.println();
    //         i = i + 1;




    // public static void main(String[] args) {
    //     Scanner s= new Scanner(System.in);
    //     int n=s.nextInt();

    //     int i=1;
    //     while(i<=n){
    //         int j=1;
    //         while(j<=(n-i)){
    //             System.out.println(" ");
    //             j++;

    //         }
    //         while (j<=n) {
    //             System.out.println("*");
    //             j++;
                
    //         }
    //         i++;
    //         System.out.println();

    //     }
    // }








    // public static void main(String[] args) {
    //     Scanner s= new Scanner(System.in);
    //     int n=s.nextInt();

    //     int k=1;
    //     int i=1;
    //     while (i<=n) {
             
    //         int j=1;
    //         while (j<=(n-i)) {
    //             System.out.println(" ");
               
    //             j++;
                
    //         }

    //         while (j<=n){
    //             System.out.println(k);
    //             k++;
    //             j++;

        
    //         }


    //         System.out.println();
    //         i++;

            
    //     }
    // }










   
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();



        int i=1;
        while(i<=n){

            int j=1;
            while(j<=(n-i)){
                System.out.println(" ");
                j++;
            }
            int k=1;
            while(k<=2*(n-i)-1){
                System.out.println("*");
                
                k++;
                

            }


            i++;
            System.out.println();
        }
    }
    
}









        
        

    


