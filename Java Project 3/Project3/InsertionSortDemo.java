package Project3;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortDemo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("How big should the array be?");

		int array_size = input.nextInt();

		int[] user_array = new int[array_size]; // Establishes how big the array will be

		Random rand = new Random();

		for (int i = 0; i < array_size; i++) { // This for loop fills the array with random numbers ranging from 0 to 50
			user_array[i] = rand.nextInt(51);
		}
		
		System.out.println(Arrays.toString(user_array) + "\n");

		while (true) {										// This while loop uses if statements to call certain methods 
			System.out.println("1. Sort Ascending \n" 		// depending on what the user inputs
							 + "2. Sort Decsending \n" 
							 + "3. Shuffle \n" 
							 + "4. Quit");
			
			int user_input = input.nextInt();
			
			if (user_input == 1) {								// If the input is one, call sortAscending
				InsertionSort.sortAscending(user_array);
				System.out.println(Arrays.toString(user_array));
			}
			if (user_input == 2) {								// If the input is two, call sortDescending
				InsertionSort.sortDescending(user_array);
				System.out.println(Arrays.toString(user_array));
			}
			if (user_input == 3) {								// If the input is three, call sortRandom
				InsertionSort.sortRandom(user_array);
				System.out.println(Arrays.toString(user_array));
			}
			if (user_input == 4) {								// If the input is four, break the while loop and end the program.
				break;
			}

		}

	}

}
