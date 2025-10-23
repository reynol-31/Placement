package Tasks;

public class Tk11 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            boolean prime=true;
            if(arr[i]==1)
                prime=false;
            for(int j=2;j<arr.length;j++){
                if(arr[i]%j==0){
                    prime=false;
                }
            }
            if(prime){
                System.out.println(arr[i]);
            }
        }
    }
}
