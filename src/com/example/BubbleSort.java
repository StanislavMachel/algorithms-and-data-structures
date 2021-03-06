package com.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {

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

		for (int out = arr.length - 1; out > 1; out--) {
			for (int in = 0; in < out; in++) {
				System.out.println("arr[in]: " + arr[in]);
				System.out.println("arr[in+1]: " + arr[in + 1]);
				comparisonCount++;
				if (arr[in] > arr[in + 1]) {
					System.out.println("Swap elements arr[" + in + "]=" + arr[in] + " and arr[" + (in + 1) + "]=" + arr[in + 1] + "...");
					transpositionCount++;
					int temp = arr[in];
					arr[in] = arr[in + 1];
					arr[in + 1] = temp;
					System.out.println("Array after swap: " + Arrays.toString(arr));
				}
			}
		}

		System.out.println("Sorted array: " + Arrays.toString(arr));
		System.out.println("Comparison count: " + comparisonCount);
		System.out.println("Transposition count: " + transpositionCount);

	}
}
