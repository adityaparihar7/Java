public class string_learn {
    public static void main(String[] args) {
        String str = "abcd";
        String s = new String("abcd");
        System.out.println(str.charAt(2));
        System.out.println(str.length());
        
        StringBuilder ss =new StringBuilder("abcd");
        ss.setCharAt(0,'f');
        System.out.println(ss);




    }
    
    
}
