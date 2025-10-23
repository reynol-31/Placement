package Tasks;

public class Tk6 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int e=0,o=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                e++;
            }else{
                o++;
            }
        }
        System.out.println("Even count: "+e+"\n"+"Odd count: "+o);
    }
}
