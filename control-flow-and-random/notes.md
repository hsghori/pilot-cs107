\maketitle
Random Numbers
--------------

Sometimes we may want to generate a random number as part of our program
(we could be writing a board game that uses a dice, simulating a
biological process, or testing another program). Java has a specific
module designed to handle random number generation.\
To use this module we must import the Random class and declare a new
Random object - keep in mind you only need to declare one random object
even if you want to generate multiple random variables. If we have
`Random randy = new Random();`

-   `randy.nextInt();`\
    Returns a random integer.

-   `randy.nextInt(x);`\
    Returns a random integer between 0 and x (not including x).

-   `randy.nextDouble();`\
    Returns a random double between 0 and 1.

-   `randy.nextBoolean();`\
    Returns a random boolean value (true or false).

-   `randy.nextGaussian();`\
    Returns a random double from the Gaussian (Normal) distribution with
    mean 0 and standard deviation 1.

We can use these methods to generate random integers and floats between
L (inclusive) and H (exclusive).

-   `randy.nextInt(H-L+1) + L`\
    Returns a random integer between L and H (inclusive).

-   `randy.nextDouble()*(H-L) + L`\
    Returns a random double between L and H (inclusive).

The complete list of random number generation methods can be found at
<https://docs.oracle.com/javase/7/docs/api/java/util/Random.html>.

### Example

The following program takes two doubles as inputs (high and low) and
prints two random numbers - the first is a random integer between high
and low (inclusive) and the ssecond a random double between high and low
(inclusive).

```Java
import java.util.Random;
import java.util.Scanner;

public class RandomExample {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random gen = new Random();
        System.out.print("High: ");
        double high = kb.nextDouble();
        System.out.printf("Low: ");
        double low = kb.nextDouble();
        // note that (int) high casts the double variable "high" to an integer
        int randInt = gen.nextInt((int) high - (int) low + 1) + (int) low;
        double randDouble = gen.nextDouble() * (high-low) + low;
        System.out.printf("A random number between %f and %f is %d\n", low, high, randInt);
        System.out.printf("A random double between %f and %f is %f\n", low, high, randDouble);
    }
    
}
```

Control Flow
============

Boolean Statements
------------------

Boolean is one of the primitive data types in Java. A boolean variable
can take on two values, true or false and can be created using
combinations of relational statements and boolean variables chained
together by logical operators.

**Relational Operators**

-   $<$ less than

-   $>$ greater than

-   $<=$ less than or equal to

-   $>=$ greater than or equal to

-   $==$ check for equality

-   $!=$ not equal

**Logical Operators**

-   && and

-   $||$ or

-   ! not

A && B is true if and only if, A and B both evaluate to true. Otherwise
A && B is false.

A $||$ B is true if and only if, either A or B or both A and B are true.
Otherwise A $||$ B is false.

!A is true if and only if A is false. Otherwise !A is false.

These statements can be summarized by the following tables

**AND**

  ------- ------- --------
     A       B     A && B
   false   false   false
   true    false   false
   false   true    false
   true    true     true
  ------- ------- --------

**OR**

  ------- ------- ----------
     A       B     A $||$ B
   false   false    false
   true    false     true
   false   true      true
   true    true      true
  ------- ------- ----------

**NOT**

  ------- -------
     A      !A
   false   true
   true    false
  ------- -------

For example

```Java
bool x = 5 < 10; // true
bool y = 5 > 10; // false
bool z = x && y; // false
bool z = x || y; // true
```

If, Else If, and Else
---------------------

If/Else if/Else blocks are used to execute specific lines of code based
on a set of conditions. There are several ways to use these blocks.\
If I want to execute a block of code only if a condition is true I would
use an if statement. An if statement is paired with a specific boolean
expression (condition). If that boolean expression evaluates to true,
the code inside the if block is executed. Otherwise, the code is not
executed.

```Java
int val = kb.nextInt();
if (val > 5) {
    // inside the if block
    System.out.println("val was greater than 5");
}
```

If I want to execute a block of code if a condition is true and a
completely different block if the condition is false I would use an if
block paired with an else block. An else block comes after an if (or
else if, see below) and is executed if the if statement's boolean
condition evaluates to false. In the example below, we want to print one
statement if the user entered a value greater than 5 and a completely
different statement otherwise.

```Java
int val = kb.nextInt();
if (val > 5) {
    // inside the if block
    System.out.println("val was greater than 5");
}
else {
    // inside the else block
    System.out.println("val was less than or equal to 5");
}
```

If I want to execute a different block of code based on more than two
possible outcomes (ie one block if condition\_1 is true, another if
condition\_2 is true, another if condition\_3 is true, etc) I would use
an if block paired with else if blocks and optionally a final else
block. A set of else if block comes after an if block. Each individual
else if is paired with a boolean conditions - if none of the conditions
above were true and the else if's condition is true, that block of code
gets executed. If none of the if or else if blocks get executed, the
else block is executed.

```Java
double grade = kb.nextDouble();
if (grade > 90) {
    System.out.println("A");
}
else if (grade > 80) {
    System.out.println("B");
}
else if (grade > 70) {
    System.out.println("C");
}
else if (grade > 60) {
    System.out.println("D");
}
else {
    System.out.println("F");
}
```

Switch
------

A switch statements is used when we want to perform a specific action if
a primitive variable or String is equal to a specific value. Instead of
writing:

```Java
if (x == value1) {
    // statements
}
else if (x == value2) {
    // statements
}
else {
    // statements
}
```

We can write:

```Java
switch (x) {
    case value1: 
        // statements
        break;
    case value2: 
        // statements
        break;
    default: 
        // statements
        break;
}
```

Nore that the default case corresponds to the \"else\" block in an if /
else if / else structure. The `break` keyword breaks out of the switch
strucure. If you don't end a case with a `break`, the program will
simply move on through to the next case. This behaviour gives us a bit
more flexibility than if/else if statements when it comes to \"or\"
behaviours. If you want to have an \"or\" type statements with mutliple
variables (ie if x == X or x == Y) we can exclude the break statement
and let the cases merge.

```Java
switch (x) {
    case value1: 
    case value2: 
        // statements
        break;
    default: 
        // statements
        break;
}
```

Is the same as

```Java
if (x == value1 || x == value2) {
    // statements
}
else {
    // statements
}
```

Or say we have three possible actions A, B, and C. If the user enters
'a' we want to perform 'Action A', if the user enters 'b' we want to
perform 'Action B' and then 'Action A', and if the user enters anything
else we want to perform 'C'. Below are examples of how you could do this
with a switch and an if/else if/else structure. Notice how the switch
statement is syntactically cleaner than the if/else if/else (though both
are technically right).

```Java
// switch example
char choice = kb.nextInt().charAt(0);
switch (choice) {
    case 'b':
        // do B
    case 'a':
        // do A 
        break;
    default:
        // do C
}
```

```Java
// if / else if / else example
char choice = kb.nextInt().charAt(0);
if (x == 'a') {
    // do A
}
else if (x == 'b')
    // do A 
    // do B
}
eles {
    // do C
}
```
