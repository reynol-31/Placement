package stack;

import java.util.Set;
import java.util.TreeSet;

public class main5 {
    public static void main(String[] args) {
        int arr[]={4,3,2,0,-1,7};
        Set<Integer> s=new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }
        System.out.println(s);
    }
}
