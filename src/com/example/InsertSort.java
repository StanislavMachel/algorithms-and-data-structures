package com.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InsertSort {

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

		//out - marker
		for (int out = 1; out < arr.length; out++) {
			int temp = arr[out];
			System.out.println("temp: arr[" + out + "]=" + arr[out]);
			int in = out;
			comparisonCount++;
			while (in > 0 && arr[in - 1] >= temp) {
				transpositionCount++;
				System.out.println("arr[in]:arr[" + in + "]=" + arr[in]);
				System.out.println("arr[in-1]:arr[" + (in - 1) + "]=" + arr[in - 1]);
				arr[in] = arr[in - 1];
				System.out.println("Array after shift right: " + Arrays.toString(arr));
				--in;
			}
			arr[in] = temp;
			transpositionCount++;
			System.out.println(Arrays.toString(arr));
		}

		System.out.println("Sorted array: " + Arrays.toString(arr));
		System.out.println("Comparison count: " + comparisonCount);
		System.out.println("Transposition count: " + transpositionCount);

	}
}
