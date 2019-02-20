package project06;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {

	public int compare(String a, String b) {

		if (a.length() > b.length()) { // Flip the < sign so the program would print the longest string first
			return -1;
		}
		else if (a.length() == b.length()) {
			return 0;
		} else
			return 1;
	}
}