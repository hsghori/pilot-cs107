import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class Example {


	public static void increment(int x) {
		x++;
	}

	public static void appendFoo(String s) {
		s += "Foo";
	}

	public static boolean anyLetterIsJ(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'j') {
				return true;
			}
		}
		return false;
	}


	public static void main(String[] args) throws IOException {

		int j = 10;
		increment(j);
		System.out.println(j); // 10

		String k = "Bar";
		appendFoo(k);
		System.out.println(k); // Bar

		Random r = new Random();
		double rand = new Random().nextDouble();

		Scanner infile = new Scanner(new FileReader("test.txt"));


		while (infile.hasNextLine()) {
			String line = infile.next();
			String remainingLine = infile.nextLine();
			
			System.out.println(line);
			System.out.println(remainingLine);
		}
 

		for (int j = 0; j < bound; j++) {
			foo();
		}


		{
			int j = 0;
			while (j < bound) {
				foo();
				j++;
			}
		}

		// won't work, RIP j
		System.out.println(j);




		String letterC = "c";
		char   letterC = 'c';

		int x = 5, y = 10;
		int z = 5 / 3 * (x + -y); // 60

		z =    5 + 10 + 15
			+ 20 + 21 + 22
		 	+ 23 + 25;

		double s = (int)x / 3.0 + (y * 10.0);

		boolean t = true, f = false;
		boolean w = true && (!f || t);

		/*


		true  && true  == true;
		true  && false == false;
		false && true  == false;
		false && false == false;


		true  || true  == true;
		true  || false == true;
		false || true  == true;
		false || false == false;
		

		&& ||


		*/

		int i = 0;
		while (i < bound) {
			++i;
		}

		{
			putThingsInBraces();
		}

		if (something)
			if (somethingElse)
				do stuff(); while (otherStuff());
		else 
			while (condition) 
				otherStuff();
			
		ohAndAlsoThis();
		


	}
}
