package array;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        // int arr[][][]={
        //     {
        //         {1,2,3},
        //         {4,5,6},
        //         {7,8,9},
        //     },
        //     {
        //         {10,11,12},
        //         {13,14,15},
        //         {16,17,18},
        //     },
        //     {
        //         {19,20,21},
        //         {22,23,24},
        //         {25,26,27}
        //     }
        // };
        int arr[][][]=new int[3][3][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
                    arr[i][j][k]=sc.nextInt();
                }
            }
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        sc.close();
    }
}
