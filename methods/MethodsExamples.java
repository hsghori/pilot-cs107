import java.util.Scanner;
import java.util.Random;

public class MethodExamples {

	public static void main(String[] args) {
		// helper methods are used to simplify our code. 
		// instead of repeating a bunch of similar sequences 
		// multiple times, we can cosolidate them into a single 
		// code block. 

		// i could do this:
		String someString = "this is a string";
		char firstSearchChar = ' ';
		int firstCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (someString.charAt(i) == firstSearchChar) {
				firstCount++;
			}
		}
		int numSpacesOneManual = firstCount;
		String anotherString = "this is another string";
		char secondSearchChar = 'a';
		int secondCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (someString.charAt(i) == secondSearchChar) {
				secondCount++;
			}
		}
		int numSpaceTwoManual = secondCount;
		// or I could write a method called getNumChar that takes
		// a String and a char as input and returns the number of times
		// the char appears in the String. 
		int numSpacesOne = getNumChar(someString, firstSearchChar);
		int numSpacesTwo = getNumChar(anotherString, secondSearchChar);

		// A function is a sequence of code that executes a task for any 
		// input of a specific type. 
		// A function may return some value. That means the function 
		// calculate a final result which it gives back to the caller. 
		int tmp = getNumChar(someString, firstSearchChar); 
		System.out.println(tmp);
		// or a function may return nothing (void)
		printNumChar(someString, secondSearchChar);
		// A function may take in arguments (parameters) like getNumChar
		getNumChar("hello world", 'l'); // note that I don't neccesarily need to assign the retunned value to anything. 
		// or a function may take in no arguments like rollDi.
		int roll = rollDi();
		System.out.println(roll);
		// A function may 
	}

	/**
	 * Counts the number of a specific character in a string.
	 * Example of a general helper method. 
	 * @param s a string 
	 * @param c a char
	 * @return the number of times c appears in s.
	 */
	public static int getNumChar(String s, char c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if s.charAt(i) == c {
				count++;
			}
		}
		return count;
	}

	public static void printNumChar(String s, char c) {
		System.out.println("%s appears in %s %d times", "" + c, s, getNumChar(s, c));
	}

	public static int rollDi() {
		Random rand = new Random();
		return rand.nextInt(6) + 1;
	}

	/**
	 * Flips a coin and prints the result.
	 * Example of a void method.
	 */ 
	public static void flipCoin() {
		Random rand = new Random();
		if (rand.nextInt(2) == 1) {
			System.out.println("Heads");
		}
		else {
			System.out.println("Tails");
		}
	}

	/**
	 * Attempts to swap two integer values. 
	 * @param valOne the first value 
	 * @param valTwo the second value
	 */
	public static void attemptSwap(int valOne, int valTwo) {
		int temp = valOne;
		valOne = valTwo;
		valTwo = temp;
	}
}
