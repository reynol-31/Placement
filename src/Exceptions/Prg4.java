package Exceptions;
public class Prg4 {
    public static void main(String[] args) {
        System.out.println("Program Starts");
        try{
            System.out.println(10/0);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch(StringIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch(NullPointerException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Program Ends");
    }
}