package Unit3;
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque1 {
    public static void main(String[] args) {
        Deque <String> dq=new ArrayDeque<>();
        dq.add("First");
        dq.addFirst("Zero");
        dq.addFirst("Second");
        System.out.println(dq.getLast());
        System.out.println(dq.getFirst());
        System.out.println(dq);
        System.out.println(dq.removeFirst());
        System.out.println(dq.removeLast());
    }
}
