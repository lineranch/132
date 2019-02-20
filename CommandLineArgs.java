package week05;

public class CommandLineArgs { // Notce ClassNames begin with capital letters

	public static void main(String[] args) {

		/**
		 * That (String[] args), above, passed to main as an argument... that's an array
		 * of strings, called args, and it's used for command line input. To see it in
		 * action, lets create a program that accepts command line arguments, and then
		 * run the program at the command line.
		 * 
		 * We'll take 2 arguments: The first, arg[0], is to remain a string. The second, arg[1] 
		 * is to be parsed as an integer
		 * 
		 * The program will print the user's string n number of times
		 * 
		 * To run the program at the command line, navigate to the .class file, and
		 * type: java packagename.filename arg1 arg2
		 * 
		 * In the case of this file, it will be (for example): java
		 * week05.CommandLineArgs "hello there" 5
		 * 
		 * It is possible to run the program with command line args from the IDE as
		 * well. In Eclipse, choose Run Configurations, and under the Arguments tab,
		 * type in the args
		 * 
		 */
		
		if (args.length != 2) {
			System.out.println("You need a string, followed by an integer.");
			return;
		}
		
		// capture the first art to our String variable userString
		String userString = args[0];
		
		// convert second art from String to int, and store in int variable n
		int n = Integer.parseInt(args[1]);
		
		// write a for loop to print userString n times
		for (int i = 0; i < n; i++) {
			System.out.println(userString);
		}
		

	}
}
