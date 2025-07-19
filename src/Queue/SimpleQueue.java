package Queue;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(5);
        queue.offer(4);
        queue.offer(3);
        queue.offer(2);
        System.out.println(queue.contains(4));
//        System.out.println(queue.peek());
//        System.out.println(queue.remove());
//        System.out.println(queue.add(2));
        System.out.println(queue.element());

    }
}
