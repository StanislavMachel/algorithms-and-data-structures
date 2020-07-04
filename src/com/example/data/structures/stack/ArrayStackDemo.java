package com.example.data.structures.stack;

public class ArrayStackDemo {
	public static void main(String[] args) {
		ArrayStack<Integer> stack = new ArrayStack(10);

		try {
			stack.push(20);
			stack.push(40);
			stack.push(60);
			stack.push(80);

			System.out.println("Stack peek: " + stack.peek());

			System.out.println("Display stack:");

			System.out.println(stack.toString());

			System.out.println("Stack pop: " + stack.pop());

			System.out.println(stack.toString());

			stack.push(90);
			stack.push(100);
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.push(30);
			stack.push(30);

			System.out.println(stack.toString());

			stack.push(30);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Can't insert. Stack is full.");
		}
	}
}
