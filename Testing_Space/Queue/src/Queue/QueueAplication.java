package Queue;

import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class QueueAplication {
	  public static void main(String[] args) {
	        // Queue
	        Queue<String> queue = new LinkedList<>();
	        queue.offer("Laranja");
	        queue.offer("Banana");
	        queue.offer("Morango");
	        System.out.println("Queue: " + queue);
	        System.out.println("Dequeue: " + queue.poll());
	        System.out.println("Queue: " + queue);

	        // Deque (Double-Ended Queue)
	        Deque<String> deque = new LinkedList<>();
	        deque.offerFirst("Laranja");
	        deque.offerLast("Banana");
	        deque.offerFirst("Morango");
	        System.out.println("Deque: " + deque);
	        System.out.println("Dequeue from front: " + deque.pollFirst());
	        System.out.println("Deque: " + deque);

	        // HashSet
	        Set<String> set = new HashSet<>();
	        set.add("Laranja");
	        set.add("Banana");
	        set.add("Morango");
	        set.add("Laranja"); // ignora conteudo duplicado
	        System.out.println("HashSet: " + set);

	        // HashMap
	        Map<String, Integer> map = new HashMap<>();
	        map.put("Laranja", 1);
	        map.put("Banana", 2);
	        map.put("Morango", 3);
	        System.out.println("HashMap: " + map);
	        System.out.println("Value for 'Banana': " + map.get("Banana"));

	        // PriorityQueue
	        PriorityQueue<Integer> pq = new PriorityQueue<>();
	        pq.offer(5);
	        pq.offer(2);
	        pq.offer(8);
	        pq.offer(1);
	        System.out.println("PriorityQueue: " + pq);
	        System.out.println("Dequeue (highest priority): " + pq.poll());
	        System.out.println("PriorityQueue: " + pq);
	    }
}
