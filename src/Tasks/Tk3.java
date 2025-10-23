package Tasks;

import java.util.ArrayList;
import java.util.List;

public class Tk3 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        List<Integer> o=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            o.add(arr[i]);
        }
        System.out.println(o);
    }
}
