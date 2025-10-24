package Tasks;

public class Tk11 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int p=0;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for(int j=1;j<=arr[i];j++){
                if(arr[i]%j==0)
                    p++;
            }
            if(p==2){
                System.out.println(arr[i]+" ");
                sum+=arr[i];
            }
            p=0;
        }
        System.out.println(sum);
    }
}
