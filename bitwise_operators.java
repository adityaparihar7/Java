public class bitwise_operators {
    public static void main(String[] args) {
        //BITWISE AND OPERATOR
        int x=4&10;
        System.out.println(x);

        //BITWISE OR OPERATOR
        int y=4|10;
        System.out.println(y);
        

        //BITWISE NOT OPERATOR
        int z=~4;
        System.out.println(z);


        //BITWISE LEFT SHIFT OPERATOR (double the value if 1 then 10is equal to 20 
        // and if 2 then 20*2 so 40
        //and if 3 then 40*2 so 80 and so on....)
        int r = 10<<1;
        System.out.println(r);


        //BITWISE RIGHT SHIFT OPERATOR (HALF THE VALUE IF 1 then 10 half is 5
        // if 2 then 10 half is 2.5 but will be 2 )
        int t = 10>>2;
        System.out.println(t);
    }
    
}
