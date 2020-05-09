## Section 3 - Sorting / Searching, Inheritance / Polymorphism, and Exceptions

15. The Parrot class represents a parrot with an age in years and the ability to learn sounds which it can repeat back when asked to speak. The declaration of the Parrot class is shown below.

```Java
public class Parrot {

    /** Constructs a new Parrot object */
    public Parrot(String name) {
    /* implementation not shown */
    }

    /** @return the age of the parrot in years */
    public int getAge() {
    /* implementation not shown */
    }

    /** Adds sound to the list of sounds the parrot can make
    *  @param sound the sound to add */
    public void train(String sound) {
    /* implementation not shown */
    }

    /** @return a random sound that the parrot can make */
    public String speak() {
    /* implementation not shown */
    }

    // There may be instance variables, constructors, and methods that are not shown.
}
```

A pirate parrot is a type of parrot. A pirate parrot knows how to make the sound “Polly want a cracker” immediately upon birth. A pirate parrot can also steal souls whose age becomes part of the pirate parrot’s age. A pirate parrot is represented by the PirateParrot class, which you will write.

Assume that the following code segment appears in a class other than PirateParrot. The code segment shows an example of using the PirateParrot class.

```Java
PirateParrot polly = new PirateParrot("Polly");

System.out.println(polly.getAge()); // prints 0
/* code to increase Polly's age by 5 years */
System.out.println(polly.getAge()); // prints 5

polly.stealSoul(5);
polly.stealSoul(10);
System.out.println(polly.getAge()); // prints 20

polly.train("Walk the plank");
polly.train("Off with his head");

// Polly retires from his life as a pirate to a cushy life as a pet

Parrot myPetPolly = polly;
System.out.println(myPetPolly.getAge()); // prints 20
myPetPolly.train("Time for bed");
System.out.println(myPetPolly.speak());
/* prints one of the following, chosen at random:
 * Polly want a cracker
 * Walk the plank
 * Off with his head
 * Time for bed
 */
```

Write the PirateParrot class. Your code must produce the indicated results when invoked by the code given above.

16. What will be the output of the following program?
```Java
class A { }

class B extends A { }

class C extends B { }

public class MainClass {

    static void overloadedMethod(A a) {
        System.out.println("ONE");
    }

    static void overloadedMethod(B b) {
        System.out.println("TWO");
    }

    static void overloadedMethod(Object obj) {
        System.out.println("THREE");
    }

    public static void main(String[] args) {
        C c = new C();
        overloadedMethod(c);
    }
}
```

17. Write a program to keep track of the inventory of a vehicle dealership. The dealership can have Cars, Trucks, Motorcycles, and Sports Cars in its Inventory. Use the following interface and UML diagram to design your class. Cars, Trucks, Motorcycles, and Sports Cars should have a constructor that takes in the brand, cost, and status (for lease or for sale) of the vehicle. You have some freedom as to how to define these classes, but use object oriented principles in your design. \\The Inventory should maintain a list of Vehicles and should be able to add, remove, list, and printed a list filtered by type of vehicle, status (lease or for sale), or cost.

```Java
public interface Vehicle {

    public int getNumPassengers();

    public double getCost();

    public String toString();
}
```

![](src/uml.png){width=500px}

18. Implement the following methods:
    - `insertionSort(int[] arr)`
    - `selectionSort(int[] arr)`
    - `bubbleSort(int[] arr)`
    - `mergeSort(int[] arr)`
19. What is the algorithmic complexity ($O(...)$) for:
    - Searching a 1D array for a specific value?
    - Searching a 1D sorted array for a specific value?
    - Multiplying two Y by Y square matrices.
19. Modify the following code to handle incorrect input at the Scanners. The user should be repeatedly prompted to enter input until they enter the correct type of input.

```Java
import java.util.Scanner;

public class Problem19 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int inputInt = kb.nextInt();
    }
}
```

20. You are writing a `Rectangle` class with a `pubilc void setSideLengths(int h, int w)` method. Write a custom exception called `InvalidSideLengthsException` that is a subclass of `IllegalArgumentException` (see [documentation](https://docs.oracle.com/javase/7/docs/api/java/lang/IllegalArgumentException.html)). The `InvalidSideLengthException` is thrown when the user attempts to set a side length to a non-positive ($\leq 0$) value.

```Java
/**
 * Constructor for the invalid side length exception.
 * @param invalidVal the value of the invalid side length
 * @param side 'h' if the side was the "height" of the rectangle and 'c' if the side was the "width"
 */
public InvalidSideLengthException(int invalidVal, char side);

/**
 * Returns a message of the form.
 * "You entered a value of <val> for the <side-type> of a rectangle."
 */
 public void message();

```