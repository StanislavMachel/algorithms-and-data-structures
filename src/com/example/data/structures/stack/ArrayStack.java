package com.example.data.structures.stack;

import java.util.Arrays;

public class ArrayStack<E> {

	private Object[] stackArray;
	private int top;

	public ArrayStack(int size) {
		stackArray = new Object[size];
		top = -1;
	}

	public void push(E value) {
		stackArray[++top] = value;
	}

	public E pop() {
		return (E) stackArray[top--];
	}

	public E peek() {
		return (E) stackArray[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == stackArray.length - 1;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");

		if(!isEmpty()){
			for (int i = top; i > -1; i--){
				if(i != top) sb.append(", ");
				sb.append(stackArray[i].toString());
			}
		}

		sb.append("]");
		return sb.toString();
	}
}
