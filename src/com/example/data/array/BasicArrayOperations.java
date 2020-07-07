package com.example.data.array;

import java.util.Random;
import java.util.Scanner;

public class BasicArrayOperations {

	private static int[] arr;
	private static int totalElems = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please insert array size:");

		arr = new int[scanner.nextInt()];

		System.out.println("Please insert count of filled numbers:");

		int sizeOfPrefilled = scanner.nextInt();

		System.out.println("Allow duplicates? Y/N:");

		String yesNo = scanner.nextLine();

		if (scanner.hasNextLine() && yesNo.isEmpty()) {
			yesNo = scanner.nextLine();
		}

		boolean allowDuplicates = yesNo.toLowerCase().startsWith("y");

		Random random = new Random();

		for (int i = 0; i < sizeOfPrefilled; i++) {

			int randomValue = random.nextInt(100);

			if (!allowDuplicates) {
				while (search(randomValue) != -1) {
					randomValue = random.nextInt(100);
				}
			}

			arr[i] = randomValue;
			totalElems++;

		}

		System.out.println(displayArr());

		while (true) {
			System.out.println("Commands:");
			System.out.println("I - insert");
			System.out.println("R - delete");
			System.out.println("D - display");

			String cmd = scanner.nextLine().toUpperCase();

			if (scanner.hasNextLine() && cmd.isEmpty()) {
				cmd = scanner.nextLine().toUpperCase();
			}

			switch (cmd) {
				case "I":
					System.out.println("Please enter value will be inserted to array:");
					int valueToInsert = scanner.nextInt();

					if (allowDuplicates) {
						insert(valueToInsert);
					} else {
						int index = search(valueToInsert);
						if (index != -1){
							System.out.printf("Can't insert %d\n", valueToInsert);
							System.out.println("Reason: duplicates not allowed");
						}
						else {
							insert(valueToInsert);
						}
					}


					System.out.println(displayArr());
					break;
				case "R":
					System.out.println("Please enter value will be removed from array:");
					int valueToDelete = scanner.nextInt();
					boolean success = remove(valueToDelete);

					if (success) {
						System.out.printf("%d was removed from array\n", valueToDelete);
					} else {
						System.out.printf("%d don't exists in array and cannot be removed\n", valueToDelete);
					}

					System.out.println(displayArr());
					break;
				case "D":
					System.out.println(displayArr());
					break;
				default:
					System.out.println("Command not exists");

			}
		}
	}

	private static int search(int value) {
		for (int i = 0; i < totalElems; i++) {
			if (arr[i] == value) {
				return i;
			}
		}

		return -1;
	}

	private static void insert(int value) {
		arr[totalElems] = value;
		totalElems++;
	}

	private static boolean remove(int value) {
		int index = search(value);
		if (index == -1) return false;

		for (int i = index; i < totalElems; i++) {
			arr[i] = arr[i + 1];
		}

		totalElems--;
		return true;
	}

	private static String displayArr() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < totalElems; i++) {
			if (i != 0) {
				sb.append(", ");
			}
			sb.append(arr[i]);
		}
		sb.append("]");

		return sb.toString();
	}
}
