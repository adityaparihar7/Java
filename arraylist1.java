import java.util.ArrayList;
import java.util.Collections;

public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add elements
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(30);

        System.out.println(list);


        // //get element
        // int element=list.get(2);
        // System.out.println(element);


        // //add element in between
        // list.add(2,5);
        // System.out.println(list);

        // //set element
        // list.set(1, 5);
        // System.out.println(list);


        // //delete element 
        // list.remove(1);
        // System.out.println(list);

        //iterate for elements
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));


            
        }
        Collections.sort(list);
        System.out.println(list);
    }



}
