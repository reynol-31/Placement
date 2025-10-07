package stack;

import java.util.Map;
import java.util.TreeMap;

public class Main3 {
    public static void main(String[] args) {
        Map<Integer,String> m=new TreeMap<>();
        m.put(0, "c");
        m.put(0, "c++");
        m.put(-2, "java");
        m.put(3, "python");
        System.out.println(m);
    }
}
