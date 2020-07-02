package com.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SelectSort {
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

		System.out.println("Initial array: " + Arrays.toString(arr));

		int comparisonCount = 0;
		int transpositionCount = 0;

		int min;

		for (int out = 0; out < arr.length - 1; out++) {
			min = out;
			System.out.println("Min: arr[" + min + "]=" + arr[min]);
			for (int in = out + 1; in < arr.length; in++) {
				comparisonCount++;
				if (arr[in] < arr[min]) {
					min = in;
					System.out.println("Min changed current min: arr[" + min + "]=" + arr[min]);
				}
			}

			System.out.println("Swap elements arr[" + out + "]=" + arr[out] + " and arr[" + min + "]=" + arr[min] + "...");
			transpositionCount++;
			int temp = arr[out];
			arr[out] = arr[min];
			arr[min] = temp;
			System.out.println("Array after swap: " + Arrays.toString(arr));
		}

		System.out.println("Sorted array: " + Arrays.toString(arr));
		System.out.println("Comparison count: " + comparisonCount);
		System.out.println("Transposition count: " + transpositionCount);
	}
}
