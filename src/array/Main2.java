package array;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // int a[]={1,2,3,4,5};
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the value of "+i+" index");
            arr[i]=sc.nextInt();
        }
        for(int ele:arr){
            System.out.println(ele);
        }
        sc.close();
    }
}
