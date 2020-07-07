package com.example.data.structures.queue;

public class ArrayPriorityQueue {

	private int[] queueArray;
	int totalItems;

	public ArrayPriorityQueue(int size) {
		queueArray = new int[size];
		totalItems = 0;
	}

	public void insert(int object) {
		if (isEmpty()) {
			queueArray[totalItems++] = object;
		} else {
			int i;
			for (i = totalItems - 1; i >= 0; i--) {
				if (object > queueArray[i]) {
					queueArray[i + 1] = queueArray[i];
				} else {
					break;
				}
			}

			queueArray[i + 1] = object;
			totalItems++;

		}
	}

	public int remove() {
		return queueArray[--totalItems];
	}

	public int peekMin() {
		return queueArray[totalItems - 1];
	}

	public boolean isEmpty() {
		return totalItems == 0;
	}

	public boolean isFull() {
		return totalItems == queueArray.length;
	}

	@Override
	public String toString() {


		StringBuilder sb = new StringBuilder();
		sb.append("[");

		for (int i = totalItems - 1; i >= 0; i--){
			if(i != totalItems - 1){
				sb.append(", ");
			}
			sb.append(queueArray[i]);
		}

		sb.append("]");
		return sb.toString();
	}

	public String displayQueueInfo() {
		StringBuilder sb = new StringBuilder();


//		sb.append(String.format("Front index: %d\n", front));
//		sb.append(String.format("Rear index: %d\n", rear));

		sb.append("Internal array: ");
		sb.append("[");

		for (int i = 0; i < queueArray.length; i++) {
			if (i != 0) {
				sb.append(", ");
			}
			sb.append(queueArray[i]);
		}

		sb.append("]");

		return sb.toString();
	}
}
