package Queue;


import java.util.LinkedList;

public class LinkedListQueue {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        //we can treat both as stack and Queue
//        list.offer(1);
//        list.offer(2);
//        list.offer(3);
        list.push(1);
        list.push(2);
        list.push(3);
//        list.add(2,3);
        System.out.println(list.add(3));
        list.addFirst(3);


    }
}
