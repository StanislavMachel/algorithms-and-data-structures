package com.example.data.structures.queue;

public class ArrayQueueDemo {
	public static void main(String[] args) {
		ArrayQueue<Integer> queue = new ArrayQueue<>(5);

		queue.insert(10);
		queue.insert(20);
		queue.insert(30);
		queue.insert(40);


		System.out.println(queue.toString());
		System.out.println("Display internal array of queue:\n" +  queue.displayQueueInfo());

		queue.remove();
		queue.remove();
		queue.remove();

		System.out.println(queue.toString());
		System.out.println("Display internal array of queue:\n" +  queue.displayQueueInfo());


		queue.insert(50);
		queue.insert(60);
		queue.insert(70);
		queue.insert(80);

		System.out.println(queue.toString());
		System.out.println("Display internal array of queue:\n" +  queue.displayQueueInfo());
	}


}
