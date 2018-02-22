/**
 * Examples for CS107 quiz
 * @author Haroon Ghori
 */
public class QuizExamples {
	/**
	 * The main method.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		// Print statements 
		System.out.print("This prints a statement and ");
		System.out.print("Leaves the cursor on the same line.\n");
		System.out.println("This prints a statement and leaves the cursor on the same line.");
		String end = "formatted string.\n";
		System.out.printf("This prints out some %s", end);
		// printf cheat sheet : 
		
		// Variables 
		int varOne; // declares an integer variable called varOne;
					// value is set to default.
		varOne = 10; // defines varOne to a value.
		int varTwo = 1.23; // declares and defines an integer variable
						   // called varTwo
		// (see notes on variable scope below) 
		// once a variable has been declared / defined we can reassign 
		// it. 
		varOne = 20; 
		varTwo = varOne * 1.5;
		// note that = is a "set" operator instead of an "equals" statement.
	    // so we can have the same variable on both sides of the = sign
		varOne = varOne + 10;
		varTwo = varTwo * 10;
		// ^ these kind of statements can be accomplished with some shorthand
		varOne += 10;
		varTwo *= 10;
		// the same works for all arithmetic operators (+,-,*,/,%)
		
		// order of operations is the same as elementary school (PEMDAS)
		varTwo = (10 + 3) * 1.5 - 7; 

		// integer division: when two integers are divided by each other
		// the result must also be an integer. So any floating point component
		// is discarded
		varOne = 2 / 3; // varTwo = 0
		varOne = 100 / 15; // varOne = 6
		varTwo = 100 / 15.0; // varTwo = 6.66667 

		// booleans are values that evaluate to True or False 
		boolean thisIsTrue = (1 < 2); 
		boolean thisIsFalse = (2 < 1);
		// You can use relational statements like >, <, == (equals), >=, <=
		// to construct boolean statements.
		System.out.println("varOne: " + varOne + ", varTwo: " + varTwo);
		System.out.println("varOne >= varTwo? : " + (varOne >= varTwo));
		// You can use logical operators &&, ||, ! (and, or, not) to construct complex
		// boolean equations from simple conditions. 
		boolean varThree = true || false && true;
		System.out.println(varThree);

		// We can use the Java Scanner to take in user input from the keyboard.
		Scanner kb = new Scanner(System.in); // sets up the scanner
		String word = kb.next(); // gets String up to next whitespace or newline.
		String line = kb.nextLine(); // gets String up to next newline.
		int nextInt = kb.nextInt(); // gets next int on the keyboard ignoring whitespace.
		double nextDouble = kb.nextDouble(); // gets next double on the keyboard (ignoring whitespace). 
		// NOTE there is no kb.nextCharacter() method
		
		// user input makes our boolean conditions much more exciting
		int someVal = kb.nextInt();
		boolean biggerThanTwo = (someVal > 2);

		// If / Else / Switch 
		// Loops 
		// Scope
		// See the examples on github

	}
}
