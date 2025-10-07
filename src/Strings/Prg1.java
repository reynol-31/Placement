package Strings;

public class Prg1 {
    public static void main(String[] args) {
       StringBuffer sb=new StringBuffer("java programming");
       System.out.println(sb.replace(5, 15, "Python"));
       System.out.println(sb.reverse());
    }
}