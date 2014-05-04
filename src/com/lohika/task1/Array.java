package com.lohika.task1;

import java.util.Random;

public class Array {
	public static void main(String[] args) {
		int[][] array = new int[3][4];
		initializeWithRandom(array);
		printArray(array);
		modifyArray(array);
		printArray(array);
	}

	public static void printArray(int[][] array) {
		System.out.println("=====================================");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + ", ");
			}
			System.out.println();
		}
		System.out.println("=====================================");
	}

	public static void initializeWithRandom(int[][] array) {
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(101);
			}
		}
	}

	public static void modifyArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] < 10)
					array[i][j] = 0;
			}
		}
	}

}
