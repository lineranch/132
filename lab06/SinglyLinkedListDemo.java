package lab06;

import java.util.Scanner;

public class SinglyLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SinglyLinkedList<String> airports = new SinglyLinkedList<String>();
		
		airports.addFirst("MSO");
		airports.removeFirst();
		airports.addFirst("SFO");
		airports.addLast("LAX");
		airports.addLast("SLC");
		airports.addLast("BOS");
		airports.addLast("BZN");
		
		System.out.println(airports.toString());
		//System.out.println(airports.getElement());
		
		SinglyLinkedList<Song> playlist = new SinglyLinkedList<Song>();
		
		playlist.addFirst(new Song("1979", "Smashing Pumpkins"));
		playlist.addLast(new Song("Mr. Badman", "The Really Cooks"));
		playlist.addLast(new Song("In The Summertime", "Mungo Jerry"));
		
		System.out.println(playlist);
		
		System.out.println(airports.getNth(2));
		
		
	}

}
