package Strings;

public class Prg2 {
    public static void main(String[] args) {
        String s="c,c++,java,python";
        String arr[]=s.split(",");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
