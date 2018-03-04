/*
Exam 1 topics
- Basic java syntax
- Control flow
- Loops
- Methods

Exam 2 topics 
- Everything from exam 1
- Object Oriented Programming 
	- Inheritance 
	- Polymorphism
- Recursion
- Algorithmic Complexity and sorting
- Error handling / Exceptions

Notes

Exceptions
// e.g. IOException
// Inherit from Exception

Unchecked (Runtime) Exceptions 
// e.g. NullPtrException, ArrayOutOfBoundsException
// Inherit from RuntimeException

Sorting Algorithms 

- Bubble Sort      O(n^2)
	{ 12, 3, 17, 1, 5 }
	{ 3, 12, 17, 1, 5 } // 12 > 3, switch
	{ 3, 12, 17, 1, 5 } // 12 < 17, don't switch
	{ 3, 12, 1, 17, 5 } // 17 > 1, switch
	{ 3, 12, 1, 5, 17 } // 17 > 5, switch
	// finished with one iteration

- Selection Sort   O(n^2)
	{   12, 3, 17, 1, 5 }
	{ 1,   3, 17, 12, 5 } // one iteration (we 'selected' the smallest one)
	{ 1, 3,   17, 12, 5 } // two
	{ 1, 3, 5,   12, 17 } // three
	{ 1, 3, 5, 12,   17 } // four, and done.

- Insertion Sort   O(n^2)
	{ 12,   3, 17, 1, 5 }
	{ 3, 12,   17, 1, 5 } // one iteration (arguably two, make sure you know the numbering)
	{ 3, 12, 17,   1, 5 } // two iterations
	{ 1, 3, 12, 17,   5 }
	{ 1, 3, 5, 12, 17   } // done

- Merge Sort       O(n*log(n))

	{ 12, 3, 17, 1, 5 }
	-> divide and conquer
	{ 12, 3 } { 17, 1, 5 }
	-> and again
	{ 12 } { 3 } { 17 } { 1, 5 }
	-> and again
	{ 12 } { 3 } { 17 } { 1 } { 5 }
	-> merge
	{ 3, 12 } { 1, 17 } { 5 }
	-> merge
	{ 1, 3, 12, 17 } { 5 }
	-> merge
	{ 1, 3, 5, 12, 17 } // done


*/

/* Exceptions */

public class Fall2017Final {

	public static void main(String[] args) throws IOException {

	}


	void doSomethingDangerous() throws DangerException {
		/* This could fail, and throw an exception. 
		   If it does, we need to _force_ the user of this
		   method to account for this scenario. */
	}


	void useSomethingDangerous() {

		File file = /* something */;

		try {
			doSomethingDangerous(file);

		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		} finally {
			file.close();
		}

		code();
		// code here

	}

/* Algorithmic time complexity */

	int findMax(int[] ints) {

		int currentMax = -1000000;
		for (int i = 0; i < ints.length; i++) {
			int j = ints[i];
			if (j > currentMax) { 
				currentMax = j;
			}
		}

		return currentMax;

	}

/* Recursion */

	int findMaxRec(int[] ints) {
		return findMaxRec2(ints, 0);
	}


	int findMaxRec2(int[] ints, int index) {
		int currentElem = ints[index];
		if (index == ints.length - 1) return currentElem;

		int restMax = findMaxRec2(ints, index + 1);
		if (currentElem > restMax)
			return currentElem;
		else
			return restMax;
	}

}

/* Inheritance and polymorphism */

class Base {

	public void doA() { System.out.println("Base - A"); }

	public void doB() { System.out.println("Base - B");}

}


class Sub extends Base {

	private int importantData;

	@Override
	public void doB() { 
		System.out.println("Sub - B"); 
	}

}


class Ex {

	static void doC(Sub s)  { System.out.println("Sub - C"); }

	static void doC(Base b) { System.out.println("Base - C"); }

	public static void main(String[] args) {

		Sub s  = new Sub();
		Base b = new Base();

		Base sb = new Sub();
		// Sub bs  = new Base();

		s.doA(); // Base - A
		s.doB(); // Sub - B

		b.doA(); // Base - A
		b.doB(); // Base - B

		sb.doA(); // Base - A
		sb.doB(); // Sub - B

		this.doC(s);   // Sub - C
		this.doC(b);   // Base - C

		this.doC(sb);  // Base - C

	}

}

class Foo implements Comparable {

	private int bar;

	public Foo(int bar) { this.bar = bar; }

	@Override
	public int compareTo(Object other) {
		Foo otherFoo = (Foo) other;
		if (this.bar > otherFoo.bar) return 1;
		if (this.bar < otherFoo.bar) return -1;
		return 0; 
	}


	public static void main(String[] args) {

		Comparable f1 = new Foo(1);
		Comparable f2 = new Foo(3);
		Object o = new Object();

		f1.compareTo(f2);

		f2.compareTo(o); // bad
		
	}

}
