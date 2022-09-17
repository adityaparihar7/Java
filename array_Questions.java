import java.util.Scanner;

import javax.swing.text.Utilities;

// import java.util.Scanner;
// import java.util.*;

public class array_Questions {
    // finding greatest element in tht array
    // public static void main(String[] args) {
    // Scanner s = new Scanner(System.in);
    // System.out.println("enter the size of array");
    // int n = s.nextInt();

    // int[] arr = new int[n];
    // System.out.println("now enter the elements in the array");

    // for (int i = 0; i < n; i++) {
    // int a = s.nextInt();
    // arr[i] = a;

    // }

    // int max = arr[0];

    // for (int i = 1; i < n; i++) {
    // if (arr[i] > max)
    // max = arr[i];

    // }
    // System.out.println("maximum element in array is: " + max);

    // }

    // public static void main(String[] args) {

    // int[] arr=new int[10];
    // System.out.println(arr.length);//will give array length as the output
    // }

    // public static void main(String[] args) {
    // int a=6;
    // increment(a);
    // System.out.println(a);
    // //answer will be 6 here because(when we call increment function a value will
    // be (pass by value) so a++ will be perform and a value will be 7 for that
    // function but we donot have any return in increment function so a value will
    // not be updated in the main function. So, we get 6 as the answer.)
    // }
    // public static void increment(int a) {
    // a++;

    // }
    // Always remember in java everything is (pass by value)

    // public static void main(String[] args) {
    // int[] arr = new int[5];
    // func(arr);
    // for (int i = 0; i < arr.length; i++) {
    // System.out.println(arr[i] + " ");

    // }
    // }

    // public static void func(int[] a) {

    // for (int i = 0; i < a.length; i++) {
    // a[i]++;
    // }
    // }
    // }
    // public static void main(String[] args) {
    // // Scanner s =new Scanner(System.in);
    // // int n =s.nextInt();

    // int[] arr = {2,3,4,6,7};
    // System.out.println(isSorted(arr));

    // for (int i = 0; i < arr.length; i++) {
    // System.out.println(arr[i]);

    // }
    // }

    // public static boolean isSorted(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] < arr[i-1]) {
    // return false;
    // }

    // }
    // return true;

    // }

    // public static void main(String[] args) {
    // int a=9;
    // a=a-1;
    // System.out.println(a);
    // }

    // public static void main(String[] args) {
    // int[] arr={2,3,8,6,7};
    // System.out.println(fib(6));
    // }
    // public static void fib(int n){
    // int[] arr = new int[n+1];
    // arr[0]=0;
    // arr[1]=1;
    // for(int i=2;i<=n;i++){
    // arr[i]=arr[i-1]+arr[i-2];
    // }
    // return arr[n];
    // }
    // }

    public static void main(String[] args) {
        int[] arr = new int[6];
        pair_sum(arr, 7);
    }

public static void pair_sum(int[] arr,int sum){
    for (int i = 0; i < arr.length; i++) {
        for(int j=0;j < arr.length;i++){
            if(arr[i]+ arr[j]==sum){
                System.out.println(arr[i] +"  "+arr[j]);
            }
        }

    }
    
}
