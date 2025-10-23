package Tasks;

import java.util.Scanner;

public class Tk10 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int tar,flag=0;
        Scanner sc=new Scanner(System.in);
        tar=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                flag=1;
            }
        }
        if(flag==1){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
        sc.close();
    }
}
