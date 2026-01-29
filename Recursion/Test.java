package Recursion;

public class Test {
    public static void main(String[] args) {
        int count = 0;
        change(count);
        System.out.println("count" +count);
    }
    public static void change(int a){
        System.out.println("a "+a);
        a = 10;
        System.out.println("afterchange "+a);
    }
}
