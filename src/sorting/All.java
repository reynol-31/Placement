package sorting;
public class All {
    public static void main(String[] args) {
        int arr[]={40,30,50,10,20};
        LinearSearch(arr);
        System.out.println();
        Binarysearch(arr);
        System.out.println();
        Insertionsort(arr);
        System.out.println();
        Selectionsort(arr);
        System.out.println();
        Bubblesort(arr);
    }
    public static void LinearSearch(int arr[]){
        int tar=50,p=0,index=-1;
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
    public static void Binarysearch(int arr[]){
        int tar=40,s=0;
        int e=arr.length-1;
        while (s<=e) {
            int mid=(s+e)/2;
            if (tar>arr[mid]) {
                s=mid+1;                
            }
            else if (tar<arr[mid]) {
                e=mid-1;
            }else if (tar==arr[mid]) {
                System.out.println(arr[mid]);
                break;
            }
        }
    }
    public static void Insertionsort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            while (i>0&&arr[i]<arr[i-1]) {
                int temp=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=temp;
                i--;
            }
        }
        for (int ele : arr) {
            System.out.println(ele);
        }
    }
    public static void Selectionsort(int arr[]){
        for (int i=0;i<arr.length-1;i++) {
            int min=i;
            for (int j=i+1;j<arr.length;j++) {
                if (arr[j]<arr[min]) {
                    min = j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for (int ele : arr) {
            System.out.println(ele);
        }
    }
    public static void Bubblesort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
    }
}   
