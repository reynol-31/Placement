package array;
import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        // int a[][] ={{1,2,3},{4,5,6},{7,8,9}};
        int arr[][] = new int[3][3];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print("Enter"+i+" "+j+" :");
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
