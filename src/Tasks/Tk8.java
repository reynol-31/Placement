package Tasks;

public class Tk8 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int e=0,o=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                e+=arr[i];
            }else{
                o+=arr[i];
            }
        }
        System.out.println("Odd sum: "+o+"\n"+"Even sum: "+e);
    }
}