package com.velocity;

public class App {

	private static void printArray(int[] arr) {
		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

	private static void rotateRight(int[] arr) {
		// Your logic goes here
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.print("Original array:   ");
		printArray(arr);

		rotateRight(arr);

		System.out.print("Rotated array:    ");
		printArray(arr);
	}

}
