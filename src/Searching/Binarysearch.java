package Searching;

public class Binarysearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5},tar=1,s=0;
        int e=arr.length-1;
        while (s<=e) {
            int mid=(s+e)/2;
            if (tar>arr[mid]) {
                s=mid+1;                
            }
            else if (tar<arr[mid]) {
                e=mid-1;
            }else if (tar==arr[mid]) {
                System.out.println(mid);
                break;
            }
        }
    }
}
