package com.example.data.structures.queue;

public class ArrayPriorityQueueDemo {
	public static void main(String[] args) {
		ArrayPriorityQueue queue = new ArrayPriorityQueue(10);

		queue.insert(30);
		queue.insert(50);
		queue.insert(10);
		queue.insert(40);
		queue.insert(20);

		System.out.println(queue.toString());

		System.out.println("Peek: " + queue.peekMin());

		System.out.println("Removed: " + queue.remove());

		System.out.println(queue.toString());
	}
}
