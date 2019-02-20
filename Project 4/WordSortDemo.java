/** 
 * Project 6
 * 
 * Use Quicksort or Mergesort (your choice) to sort words of a paragraph from a file
 * into lexicographical order, and then by word length, from the longest words to the smallest.
 * You may use the implementation given in the book for Mergesort and/or Quicksort.
 * 
 * Write the output of the program to files Lexicographical.txt and LongestToShortest.txt.
 * Submit the text files, along with this modified driver program, your Quicksort or Mergesort program,
 * and the StringLengthComparitor.
 * 
 * Besides this WordSortDemo driver file to get you started, included in this week's content are
 * * StringLengthComparator.java -- the comparator from page 364 of the textbook
 * * IOExample.java -- an example program showing how read from and write to files Java 
 * * SortExample.java -- an example program demonstrating the use of comparators, including the above
 * * FarewellToArms.txt -- 	a text file of Earnest Hemmingway's masterpiece opening to the book.
 *     						(These are the words you will be sorting in the project.)
 *     
 *     Note: lexicographical natural ordering puts capital letters in front of any lower case letters. That's fine
 *     Note: Punctionation marks will be stuck to some of the words. That's fine.
 */

package project06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;

public class WordSortDemo {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner in = new Scanner(System.in);
		ArrayList<String> wordAL = new ArrayList<>();

		// TODO: Get the file FarewellToArms.txt -- word by word -- into an array DONE
		// Hint: see IOExample for how to read in a file in. You'll want every word to
		// go into an array.
		// Hint, so you don't have to worry about capacity,
		// you may read the words into an ArrayList first, then make an array from that.

		// Scanner object is constructed with new File() for file input
		Scanner fileInput = new Scanner(new File("FarewellToArms.txt")); // Opens text file
		String test = ""; // Creates an empty string
		while (fileInput.hasNext()) // This while look adds the text from the file to the empty string
		{
			test += fileInput.nextLine();
		}
		ArrayList<String> wordArrayList = new ArrayList<String>(); // Creates an arraylist
		for (String word : test.split(" ")) { // The string is broken up by spaces and each word is then added to the arraylist
												
			wordArrayList.add(word);
		}

		// Created two arrays. One array is a lexigraphical sort and the other is a wordlength sort
		String[] armsArrayLexigraphical = wordArrayList.toArray(new String[wordArrayList.size()]);
		String[] armsArrayWordLength = wordArrayList.toArray(new String[wordArrayList.size()]);

		Comparator<String> byLexigraphical = Comparator.naturalOrder();
		// TODO: Make another comparator: byWordLength DONE
		StringLengthComparator byWordLength = new StringLengthComparator(); //This comparator uses the StringLengthComparator class

		// TODO: Use Quicksort or Mergesort here... DONE
		Quicksort.quickSortInPlace(armsArrayLexigraphical, byLexigraphical, 0, armsArrayLexigraphical.length - 1);
		Quicksort.quickSortInPlace(armsArrayWordLength, byWordLength, 0, armsArrayWordLength.length - 1);

		

		try {
			// TODO: Sort by word length into one file, by lexicographical order into another. DONE

			PrintWriter outputFile1 = new PrintWriter(new FileWriter("LongestToShortest.txt")); // Makes a file

			for (String word : armsArrayWordLength) { // Prints each element of the array into the file
				outputFile1.println(word);
			}

			outputFile1.close();

			PrintWriter outputFile2 = new PrintWriter(new FileWriter("Lexicographical.txt")); // Makes a file

			for (String word : armsArrayLexigraphical) { // Prints each element of the array into the file
				outputFile2.println(word);
			}

			outputFile2.close();
		} catch (IOException exc) {
			System.out.println("There was a problem opening the output file.");
		}

		System.out.println("<end>");
	}
}
