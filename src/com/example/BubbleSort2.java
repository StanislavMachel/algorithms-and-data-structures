package com.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//not effective
public class BubbleSort2 {
	private static int[] arr;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please insert arr size:");

		int arrSize = scanner.nextInt();

		Random random = new Random();
		arr = new int[arrSize];
		for (int i = 0; i < arrSize; i++) {
			arr[i] = random.nextInt(100);
		}

		int comparisonCount = 0;
		int transpositionCount = 0;

		System.out.println("Initial array: " + Arrays.toString(arr));

		for (int out = 0; out < arr.length; out++) {
			for (int in = out + 1; in < arr.length; in++) {
				System.out.println("arr[out]: " + arr[out]);
				System.out.println("arr[in]: " + arr[in]);
				comparisonCount++;
				if (arr[out] > arr[in]) {
					System.out.println("Swap elements arr[" + out + "]=" + arr[out] + " and arr[" + in + "]=" + arr[in] + "...");
					transpositionCount++;
					int temp = arr[in];
					arr[in] = arr[out];
					arr[out] = temp;
					System.out.println("Array after swap: " + Arrays.toString(arr));
				}
			}
		}

		System.out.println("Sorted array: " + Arrays.toString(arr));
		System.out.println("Comparison count: " + comparisonCount);
		System.out.println("Transposition count: " + transpositionCount);
	}
}
