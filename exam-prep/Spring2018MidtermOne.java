/*





	Control Constructs

	- Switch Statements

















*/

import java.util.Scanner;
import java.io.*;


public class Spring2018MidtermOne {


	public static void example() {
		
		int c = 0;
		while (true) {

			System.out.println("c = " + c);
			c++;

			if (c > 10) return;

		}
		

	}


	public static void main(String[] args) throws IOException {

		char c = /*  something */;
		int a = add(5, 8);
		switch (c) {
			case "SomeString":
				System.out.println("Adenine");
				break;
			case 'c':
				System.out.println("Not Adenine");
			default:
				System.out.println("Not Recognized");
		}


		Scanner keyboard = new Scanner(System.in);

		Scanner infile = new Scanner(new FileReader("infile.txt"));
		keyboard.next();
		keyboard.nextInt();

		infile.next();
		infile.nextInt();

		while (infile.hasNextLine()) {
			/// name student id GPA 
			String name = infile.next();
			int id = infile.nextInt();
			double gpa = infile.nextDouble();
		}

		PrintWriter outfile = new PrintWriter(new FileWriter("outfile.txt"));
		outfile.print("Hello World");
		outfile.println("abc");
		outfile.close();
	}

}
