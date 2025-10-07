package Exceptions;

public class Prg3 {
    public static void main(String[] args) {
        String n="hey";
        try {
            System.out.println(n.charAt(4));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String is not that long");
        }
        int[] arr={1,2,3};
        try {
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("end");   
    }
}
