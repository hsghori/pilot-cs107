
/* Review Session for Intro to Java Midterm */

/*
Asides:

- Are Java's .class files machine code?
    practical answer: no.
    technical answer: no, but they ARE bytecode for the JVM
    
    Effectively Java is compiled AND interpreted, in that order.
        (Compiled to .class files, JVM code)
        (Interpreted using the JVM to become machine code)
    
    File pipeline:
    .java  -> (javac) ->  .class  -> (java) ->  *execution*


- What kind of programming language IS Java, anyway?
    Object-Oriented


- What are the 'steps' of programming something?
    1. Define + Analyze
    2. Design
    3. Write code
    4. Test the code
    5. Maintain/update the code


- What are the necessities for a "general purpose" programming language?
    1. Sequential Statement Execution
    2. Decision Statements (if/else)
    3. Repetition (loops (for, while, do/while), recursion)


- What is the 'approach to programming'?
    1. Always use Subroutines
        1.a. Top-down  (Outside-in)
            Begin with the high-level functionality,
            and create the components needed to implement it
            in order from most complex to most simple.
        1.b. Bottom-up (Inside-out)
            Begin with the most basic functionality,
            and use this to create more advanced functions
            until you finally achieve the goal.
    
    In practice you'll never use just one of these methods.


- Datatypes
    - Primitive datatypes; not composed of seperable parts
        - int, long, double, float, char, bool, (... byte, short)

    - Collections; things composed of simpler data types
        - Arrays (int[], etc.)
            - can have multiple dimensions (e.g. int[10][10])
        - Strings (composed of chars)
        
- Value types vs. Reference types
    - Primitives are VALUE types, they are stored directly
      in the memory of a variable.
      
    - Classes and all other types are REFERENCE types,
      instead of their value, a 'pointer' to the value is stored,
      which just tells you where to find the real value.

*/

// How to import things
import java.util.Scanner;

// More generally,
// import <provider>.<package>.<Classname>;

public class Fa2017MidtermOne {
    
    public static void main(String[] args) {
     
        int[] arr = {1, 2, 3, 4, 5};
        
        System.out.println(arr); // {1, 2, 3, 4, 5} ???
        // No, just prints out some kind of junk
        // (which might even be different every time)
        
        
        int i = 0;
        
        i++; // Increment.
        System.out.printf("i after i++: %d\n", i);
        
        ++i; // Also increment?
        System.out.printf("i after ++i: %d\n", i); // Seems like it
        
        System.out.printf("i++: %d\n", i++); // ...Or not?
        System.out.printf("i:   %d\n", i); // What's going on
        
        System.out.printf("++i: %d\n", ++i); // Now I get it
        
        // alternatively
        int j = 0;
        boolean b;
        
        b = (j++ > 0);
        // FALSE, incremented AFTER
        System.out.println(b ? "True" : "False");
        
        b = (j-- == 0);
        // FALSE, decremented AFTER
        System.out.println(b ? "True" : "False"); 
        
        b = (++j > 0);
        // True
        System.out.println(b ? "True" : "False"); 
        
        b = (--j == 0);
        // True
        System.out.println(b ? "True" : "False");
        
        // Declaring a variable with a class type
        // is just like a primitive declaration
        Scanner in = new Scanner(System.in); // This is how you _instantiate_
        
        // Printf is a wonderful world
        // https://www.cs.colostate.edu/~cs160/.Spring16/resources/Java_printf_method_quick_reference.pdf
        
        // %d for integers
        // %f for floats
        
        /* String escapes:
             \n  - newline (MOST USEFUL ONE)
             \t  - tab
             \s  - space
             \r  - carriage return
        */
        
        
        // Decision statements
        
        boolean exp = true; // values are literally `true` or `false`
        
        if (exp) {
            System.out.println("If exp is true");
        } else {
            System.out.println("If exp is false");
        }
        
        // Only the true ones print
        if (true  || false) System.out.println("true  || false");
        if (true  || true ) System.out.println("true  || true");
        if (false || false) System.out.println("false || false");
        
        if (true  && false) System.out.println("true  && false");
        if (true  && true ) System.out.println("true  && true");
        if (false && false) System.out.println("false && false");
        
        if (!true)  System.out.println("!true");
        if (!false) System.out.println("!false");
        
        // Short-circuiting evaluation:
        if (true  || (10 / 0 == 1)) System.out.println("Avoided dividing by zero!");
        if (false && (10 / 0 == 1)) System.out.println("...And again!"); 
            
        // Switch
        char c = 'b';
        
        switch (c) {
            case 'a':
                System.out.println("c == 'a'");
                break;
            
            case 'b':
                System.out.println("c == 'b'");
            
                // note that we fall through!!!
            case 'c':
                System.out.println("c == 'c' || c == 'b'");
                break;
        }
        
        
        // Repetition statements
        
        // For: good for counting/enumerating
        
             /*initialize*/  /*condition*/  /*change*/    
        for (int var = 0;    var < 10;      var++    ) {
            // something which happens 10 times
            System.out.print("*");
        }
        
        System.out.println();
        
        // Equivalent to the above for loop
        {
            int var = 0;  /*initialize*/
            while (var < 10) { /*condition*/
                // something which happens 10 times
                System.out.print("*");
                var++; /*change*/
            }
            System.out.println();
        }
        
        
        // While: good for when you aren't sure how many times
        // something will happen
        
        int counter = 0;
               /*condition*/
        while (counter < 20) {
            // something which happens a variable
            // or hard to enumerate number of times
            System.out.print("+");
            counter = (counter + 1) * 2;   
        }
        
        System.out.println();
        
        
        // Do/While: good when it needs to happen AT LEAST one time
        // (e.g. getting input)
        
        int counter2 = 0;
        do {
            // same as while, but what you put here will
            // happen AT LEAST ONCE since the condition
            // is checked AT THE END of each iteration.
            System.out.print("-");
                 /*  condition  */
        } while (counter2++ < 100);
    
        System.out.println();
        
        
        
        
        // Variable lifetimes
        
        int x = 10;
        System.out.println(x); // prints 10
        
        // open a new scope
        {
            int y = 20; // declare a variable in a new scope
        
            System.out.println(y); // prints 20
        
        } // but y dies here
        
        // System.out.println(y); // WILL FAIL, y is not in this scope! RIP y
        
        // ALL pairs of braces work this way. loops, if/else, methods, etc.
        // Method arguments work as if they were declared within their scope.
        // For loop declarations also work this way.
        
        // Mathy things
        double d = Math.pow(3, 2);   // 3^2
        double e = Math.floor(10.7); // 10  floor always rounds down
        double f = Math.ceil(10.4);  // 11  ceiling always rounds up
        double g = Math.round(10.4); // 10  rounds to the closest integer
    
        // Parsing numbers
        // don't think about what would happen if they were invalid.
        // don't think about it.
        int    l = Integer.parseInt("109231");
        int    m = Integer.valueOf("-29999"); // basically the same
        double r = Double.parseDouble("3.1415926"); 
        
        // Converting a number to a string
        String s = l + ""; // but who wants to do this REALLY
        s = Integer.toString(l); // that's more like it
        
        
        
        
    }
    
    /* declaring a static method */
    public static int addThings(int a, int b) {
        
        // due to scoping rules, anything declared in main()
        // is NOT accessible here. 
        // however, `a` and `b` do, of course.
        return a + b;
    }
    
}



