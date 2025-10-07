package Strings;

public class Prg3 {
    public static void main(String[] args) {
        String x="   Hello";
        System.out.println(x);
        System.out.println(x.trim());
        System.out.println(x.length());
        String s="Hello";
        System.out.println(s.substring(2,4));
        System.out.println(s.substring(1 ));

        StringBuilder s1=new StringBuilder("Hello");
        s1.append("123");
        System.out.println(s1);
        s1.replace(5, 8, "777");
        System.out.println(s1);
        s1.delete(5, 8);
        System.out.println(s1);
        s1.reverse();
        System.out.println(s1);
    }
}
