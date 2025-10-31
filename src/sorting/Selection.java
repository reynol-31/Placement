package sorting;

public class Selection {
    public static void main(String[] args) {
        int arr[]={50,30,10,20,40};
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
}
