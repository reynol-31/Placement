package array;

public class Main7 {
    public static void main(String[] args) {
        int arr[][][]={
            {
                {1,2,3},
                {4,5,6},
                {7,8,9},
            },
            {
                {10,11,12},
                {13,14,15},
                {16,17,18},
            },
            {
                {19,20,21},
                {22,23,24},
                {25,26,27}
            }
        };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=arr[i][j].length-1;k>=0;k--){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=arr[i].length-1;j>=0;j--){
                for(int k=arr[i][j].length-1;k>=0;k--){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
        for(int i=arr.length-1;i>=0;i--){
            for(int j=arr[i].length-1;j>=0;j--){
                for(int k=arr[i][j].length-1;k>=0;k--){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
