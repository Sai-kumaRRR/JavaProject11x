package ex33_Collection_Frameworks.Queue;

import java.util.PriorityQueue;

public class Lab246_Queue {
    public static void main(String[] args) {
        // Queue -> 000.001 % in Automation
        PriorityQueue q = new PriorityQueue();
        q.add("SAI");
        q.add("KUMAR");
        // PQ -> Natural - sorting
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
