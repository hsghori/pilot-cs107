% Notes: Loops
Loops
=====

One of the major benefits of a computer is its ability to quickly
complete repetitive tasks. Programming languages like Java have built in
structures called loops which we can use to condense repetitive
statements.

For Loops
---------

For loops are the most straight forward and intuitive type of loop. A
for loop is defined in three stages:

1.  initialization: define a variable (var) to a specific value.

2.  ending condition: define a condition (typically based on the value
    of var) for which you want the loop to continue.

3.  assignment: define how var changes for each iteration of the loop.

This is best seen illustrated by an example.

    for (int i = 0; i < 10; i++) {
        System.out.println(i);
    }

In this example, the variable i is initialized to 0, the for loop will
continue so long as i \< 10, and at the end of each iteration of the
loop i will be incrimented by one.\
For loops can have a variety of variables, conditions, and assignments.

    for (int j = 1; j <= 2048; j*=2) {
        System.out.printf("%d ", j);
    }

We typically use a for loop when we know exactly how many times a loop
should run.

While Loops
-----------

The while loop is the most general type of loop. A while loop keeps
executing the loop body so long as a boolean condition is satisfied.

    while (booleanExpression} {
        // statements
    }

We typically use a while loop when we don't know exactly how many times
a loop should run.

Do-While Loops
--------------

A do-while loop is almost exactly like a while loop except the loop body
is executed before the condition is checke. This means that the body
will always be executed at least once.

    do {
        // statements
    } while (booleanExpression);

Examples
--------

    System.out.println("Basic for loop.");
    for (int i = 0; i < 10; i++) {
        System.out.printf("%d ", i);
    }
    System.out.println("\nFor loop with exponential increase.");
    for (int j = 1; j <= 2048; j*=2) {
        System.out.printf("%d ", j);
    }

    Random gen = new Random();
    System.out.println("\nWhile loop - continues until di rolls a 3.");
    int roll = gen.nextInt(6) + 1; // simulate rolling a 6 sided di
    while (roll != 3) {
        System.out.printf("%d ", roll);
        roll = gen.nextInt(6) + 1; // comment this line to demonstrate infinite while
    }

    System.out.println("\nDo-While loop - continues until di rolls a 3.");
    int rollTwo = 3;
    do {
         System.out.printf("%d ", rollTwo);
         rollTwo = gen.nextInt(6) + 1;
    } while (rollTwo != 3);

Loop Equivaalence
-----------------

For and do-whlie loops are, theoretically, convenient syntax for a
special case of a while loop. That means that any for or do-while loop
can be written as a while loop. However, not every while loop can be
rewritten as a for or do-while loop.

    System.out.println("\nEquivalent for and while loops.");
    for (int i = 0; i < 10; i++) {
        System.out.printf("%d ", i);
    }
    System.out.println();
    int count = 0;
    while (count < 10) {
        System.out.printf("%d ", count);
        count++;
    }
    // do-while to while
    System.out.println("\nEquivalent do-while and while loops.");
    int rollThree = 0;
    do {
        rollThree = gen.nextInt(6) + 1;
        System.out.printf("%d ", rollThree);
    } while (rollThree != 3);
    System.out.println();
    int rollFour = 0;
    while (rollFour != 3) {
        rollFour = gen.nextInt(6) + 1;
        System.out.printf("%d ", rollFour);
    }

Nested Loops
------------

Loops can be nested within each other to create some complex (and very
useful) results.

    System.out.println("\nNested for loop.\nPrints a triangle.");
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < i; j++) {
        System.out.print("*");  
        }
        System.out.println();
    }
    System.out.println("Nested for and while loop.\nContinues until average roll is less than 3.");
    double avgRoll = 6;
    final int numRolls = 10;
    while (avgRoll >= 3) {
        int acumRoll = 0;
        for (int i = 0; i < numRolls; i++) {
            acumRoll += gen.nextInt(6) + 1;
        }
        avgRoll = acumRoll / (float) numRolls;
        System.out.printf("%.2f ", avgRoll);
    }    

Scope
=====

When a varble is **declared** in Java it is given a certain **scope**. A
variables scope is the region in which it is visible (or accessible). A
variable is accessible in the block in which it is declared (including
any sub-blocks), but nowhere else.

    public class Scope {
        public static void main(String[] args) {
            int varOne; // varOne is declared in the main method scope
            varOne = 10; // varOne is defined (different from begin declared)
            if varOne > 1 {
                System.out.println(varOne); // varOne is still in scope
                varOne = 20;
                int varTwo = 1;
            }
            System.out.println(varOne); // varOne is still in scope and its value has changed
            System.out.println(varTwo); // throws a compiler error because varTwo is out of scope. 
        }
    }
