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
		for (int i = 0; i < someString.length(); i++) {
			if (someString.charAt(i) == firstSearchChar) {
				firstCount++;
			}
		}
		int numSpaceOneManual = firstCount;
		String anotherString = "this is another string";
		char secondSearchChar = 'a';
		int secondCount = 0;
		for (int i = 0; i < anotherString.length(); i++) {
			if (anotherString.charAt(i) == secondSearchChar) {
				secondCount++;
			}
		}
		int numSpaceTwoManual = secondCount;
      System.out.println("Number of " + firstSearchChar + " in someString: " + numSpaceOneManual);
      System.out.println("Number of " + secondSearchChar + " in someString: " + numSpaceTwoManual);

		// or I could write a method called getNumChar that takes
		// a String and a char as input and returns the number of times
		// the char appears in the String. 
		int numSpaceOne = getNumChar(someString, firstSearchChar);
		int numSpaceTwo = getNumChar(anotherString, secondSearchChar);
      System.out.println("Number of " + firstSearchChar + " in someString: " + numSpaceOne);
      System.out.println("Number of " + secondSearchChar + " in someString: " + numSpaceTwo);
		// A function is a sequence of code that executes a task for any 
		// input of a specific type. 
		// A function may return some value. That means the function 
		// calculate a final result which it gives back to the caller. 
      System.out.println("Different types of methods.");
		// or a function may return nothing (void)
		flipCoin();
		// A function may take in arguments (parameters) like getNumChar
		System.out.println("There are " + getNumChar("hello world", 'l') + " ls in \'hello world\'.");
		// or a function may take in no arguments like rollDi.
      System.out.println("Di rolll: " + rollDi());
      System.out.println();
      // when you pass a primative or string to a method, the variable
      // itself isn't changed. The value of the variable is copied and 
      // sent to the method. 
      System.out.println("Pss by value.");
      int valueOne = 1;
      int valueTwo = 2;
      System.out.printf("ValueOne: %d, ValueTwo: %d\n", valueOne, valueTwo);
      attemptSwap(valueOne, valueTwo);
      System.out.printf("ValueOne: %d, ValueTwo: %d\n", valueOne, valueTwo);
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
			if (s.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

	public static void printNumChar(String s, char c) {
		System.out.printf("%s appears in %s %d times", "" + c, s, getNumChar(s, c));
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
