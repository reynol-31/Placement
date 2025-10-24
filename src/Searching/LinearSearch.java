package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int tar=1,p=0,index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                index=i;
                p=1;
                break;
            }
        }
        if (p==1) {
            System.out.println(tar +" Found the index "+index);
        }else{
            System.out.println("not found");
        }
    }
}
