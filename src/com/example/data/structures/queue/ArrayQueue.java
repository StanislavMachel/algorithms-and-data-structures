package com.example.data.structures.queue;

public class ArrayQueue<E> {

	private Object[] queueArray;
	int rear;
	int front;
	int totalItems;

	public ArrayQueue(int size) {
		queueArray = new Object[size];
		rear = -1;
		front = 0;
		totalItems = 0;
	}

	public void insert(E object) {
		if (rear == queueArray.length - 1) { //cycle transfer
			rear = -1;
		}
		queueArray[++rear] = object;
		totalItems++;
	}

	public E remove() {
		Object temp = queueArray[front];
		queueArray[front] = null;
		front++;
		if (front == queueArray.length) { //cycle transfer
			front = 0;
		}
		totalItems--;
		return (E) temp;
	}

	public E peek() {
		return (E) queueArray[front];
	}

	public boolean isEmpty() {
		return totalItems == 0;
	}

	@Override
	public String toString() {


		StringBuilder sb = new StringBuilder();
		sb.append("[");

		if (!isEmpty()) {
			if (front > rear) {
				for (int i = front; i < queueArray.length; i++) {
					if (i != front) sb.append(", ");
					sb.append(queueArray[i].toString());
				}
				for (int i = 0; i <= rear; i++) {
					sb.append(", ");
					sb.append(queueArray[i].toString());
				}
			} else {
				for (int i = front; i <= rear; i++) {
					if (i != front) sb.append(", ");
					sb.append(queueArray[i].toString());
				}
			}


		}

		sb.append("]");
		return sb.toString();
	}

	public String displayQueueInfo() {
		StringBuilder sb = new StringBuilder();


		sb.append(String.format("Front index: %d\n", front));
		sb.append(String.format("Rear index: %d\n", rear));
		sb.append("Internal array: ");
		sb.append("[");

		for (int i = 0; i < queueArray.length; i++) {
			if(i != 0){
				sb.append(", ");
			}
			sb.append(queueArray[i]);
		}

		sb.append("]");

		return sb.toString();
	}
}
