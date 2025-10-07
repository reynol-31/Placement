package stack;

import java.util.Set;
import java.util.TreeSet;

public class settest {
    public static void main(String[] args) {
        Set<Integer> s=new TreeSet<>();
        s.add(3);
        s.add(6);
        s.add(0);
        s.add(-6);
        System.out.println(s);
    }
}
