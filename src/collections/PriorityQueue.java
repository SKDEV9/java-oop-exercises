package collections;

public class PriorityQueue {
    public static void main(String[] args) {

        java.util.PriorityQueue<Integer> queue = new java.util.PriorityQueue<>();

        queue.offer(4);
        queue.offer(5);
        queue.offer(1);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
