# Notes: Loops and Variable Scope

## Loops

One of the major benefits of a computer is its ability to quickly
complete repetitive tasks. Programming languages like Java have built in
structures called loops which we can use to condense repetitive
statements.

### For Loops

For loops are the most straight forward and intuitive type of loop. A
for loop is defined in three stages:
1.  initialization: define a variable (var) to a specific value.
2.  ending condition: define a condition (typically based on the value
    of var) for which you want the loop to continue.
3.  assignment: define how var changes for each iteration of the loop.

This is best seen illustrated by an example.
```Java
for (int i = 0; i < 10; i++) {
    System.out.print(i + " ");
}
```
In this example, 
1. the variable i is initialized to 0, 
2. the for loop will continue so long as i \< 10, 
3. at the end of each iteration of the loop i will be incrimented by one.\
Every iteration of this loop prints the value of i. So the output will look like 
```
1 2 3 4 5 6 7 8 9
```
For loops can have a variety of variables, conditions, and assignments. For example, this loop uses a multiplactive assignment statement:
```Java
for (int j = 1; j <= 2048; j*=2) {
    System.out.printf("%d ", j);
}
```
Outputs:
```
1 2 4 8 16 32 64 128 256 512 1024 2048
```
We typically use a for loop when we know exactly how many times a loop
should run or we know the exact range over which we need to loop. 

### While Loops

The while loop is the most general type of loop. A while loop keeps
executing the loop body so long as a boolean condition is satisfied.
```Java
Random gen = new Random();
System.out.println("\nWhile loop - continues until di rolls a 3.");
int roll = -1; // simulate rolling a 6 sided di
while (roll != 3) {
    roll = gen.nextInt(6) + 1; 
    System.out.printf("%d ", roll);
}
```
In this example, `gen.nextInt(6) + 1` simulates rolling a 6 sided di. The while loop is set to continue while the di roll is not equal to 3. Since this is a random process (we cannot know when `roll` will equal 3), this behavior can't can't be easily replicated by iterating over some range of values (ie we can't easily adapt a for loop to this situation). \
In general we use a while loop when we don't know exactly how many times
the loop will run.

### Do-While Loops

A do-while loop is almost exactly like a while loop except the loop body
is executed before the condition is checked. This means that the body
will always be executed at least once.
```Java
System.out.println("Welcome to my do-while example");
do {
     System.out.println("Press q to quit")
     String choice = kb.next();
     System.out.println(choice);
} while (!choice.equals("q"));
```
The loop above will continue until the user inputs the string "q". Note that we always want the user to see the "Press q to print" prompt at least once - this is accomplished by the do-while loop. (You may be thinking "I can do that with a while loop too", and you would be right. This syntax lets us write this behavior a more cleanly, but as we'll see below you can accomplish the same thing with a while loop). 
In general we use a while loop when we don't know exactly how many times
the loop will run but we always want the loop to run at least once. 

### Loop Equivalence

For and do-whlie loops are, theoretically, convenient syntax for a
special case of a while loop. That means that any for or do-while loop
can be written as a while loop. However, not every while loop can be
rewritten as a for or do-while loop.
```Java
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
```

### Nested Loops

Loops can be nested within each other to create some complex (and very
useful) results.
```Java
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
```

## Scope

When a varble is **declared** in Java it is given a certain **scope**. A
variables scope is the region in which it is visible (or accessible). A
variable is accessible in the block in which it is declared (including
any sub-blocks), but nowhere else.
```Java
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
```
