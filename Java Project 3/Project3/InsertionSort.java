package Project3;

import java.util.Random;

public class InsertionSort {

/**
 * 
 * @param data
 * 
 * This method randomly shuffles the array. 
 */
	public static void sortRandom(int[] data) {
		Random rand = new Random(); 
		int n = data.length;
		for (int i = 1; i < n; i++) {
			int j = rand.nextInt(i); // Assigns the int variable to a random number up to but not including the variable i
			int temporary = data[i]; // This temporary variable is the value of the i position in the index 
			data[i] = data[j]; // Make the i position of the index equal to the j position of the index
			data[j] = temporary; // The j position is now equal to the temporary position
		}
	}
/**
 * 
 * @param data
 * 
 * Code from the page on 111 of the book.
 */
	public static void sortAscending(int[] data) {
		int n = data.length;
		for (int k = 1; k < n; k++) {
			int cur = data[k];
			int j = k;
			while (j > 0 && data[j - 1] > cur) {
				data[j] = data[j - 1];
				j--;
			}
			data[j] = cur;
		}
	}
/**
 * 
 * @param data
 * 
 * Same code as the sortAscending method, except that the while look has a < symbol between data[j - 1] and cur
 */
	public static void sortDescending(int[] data) {
		int n = data.length;
		for (int k = 1; k < n; k++) {
			int cur = data[k];
			int j = k;
			while (j > 0 && data[j - 1] < cur) {
				data[j] = data[j - 1];
				j--;
			}
			data[j] = cur;
		}
	}
}
