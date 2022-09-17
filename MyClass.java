package MyClass; 

public class MyClass {
    public static void main(String args[]) {
    
    MyClass obj= new MyClass();
    
    int x=10;
    int y=30;
    
    int get_result=obj.add(x,y);
    
    System.out.println(get_result);
}

public int add (int a, int b){
    int result = a+ b;
    return result;
}
}