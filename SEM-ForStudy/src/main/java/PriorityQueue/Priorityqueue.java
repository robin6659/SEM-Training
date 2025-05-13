package PriorityQueue;

import java.util.PriorityQueue;

public class Priorityqueue {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(30);
		pq.add(10);
		pq.add(20);

		System.out.println(pq);
	}
}