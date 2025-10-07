package stack;

// import java.util.ArrayDeque;
// import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main2 {
    public static void main(String[] args) {
        Queue<Integer> s=new PriorityQueue<>();
        s.add(0);s.add(-2);s.add(5);
        s.add(1);s.add(2);s.add(4);
        s.add(3);s.add(6);s.add(-1);
        System.out.println(s.peek());
    }
}
