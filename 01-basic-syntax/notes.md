# Notes: Intro to Java

# How Does a Computer Work?

In broad terms, a computer is an extremely complex circuit that is
driven by \"binary inputs\". A user feeds in input as either 0 (no
power) or 1 (power), which when done correctly, cause the computer to
perform specific actions. These combinations of 0s and 1s are often
called binary code or machine language and are the only language a
computer truly understands.\
A computer processes a single machine instruction in one "cycle" - computer speed is measured in Hz or 
cycles per second. Modern
personal computers run at speeds of around $3 GHz$ or $3 \times 10^9$
cycles per second. It's this extraordinary speed that makes computers so
valuable. 

## What is a Programming Language?

A major problem with computers is that machine language is extremely
difficult for a human to read and write. So over the years we have
developed **programming languages** which, for the most part, are
designed to bridge the gap between natural human language and machine
language. A programming language is something that a human can easily
read and write, and that can be efficiently converted into machine
code.\
There are thousands of different programming languages in existence -
most are not in common use. This website
<http://www.99-bottles-of-beer.net/abc.html> has a list of over 500
programming languages with a program that prints the song \"99 bottles
of beer\" written in each language. All of these languages have
different properties and use cases - and there are entire classes and
books on programming language theory. Here we'll just discuss the
basics.

## High Level vs Low Level

A **high level** language is a language that's closer to natural
language than machine code. High level languages are easier to read by
humans, have more layers and safeguards between the programmer and the
processor, and are relatively slow. High level languages are very
popular for developing user level software software - websites and apps,
research and quick prototyping, and for tasks that don't require
exceptionally fast performance.\
A **low level** language is a language that's closer to machine code
than natural language. Low level languages are more difficult for humans
to read and have less layers and safeguards between the programmer and
the processor - this means it's easier for a programmer to break the
processor using a low level language. Low level languages are also
relatively fast compared to high level languages. Low level languages
are popular for designing systems level software - device drivers,
operating systems, embedded systems, etc - and for tasks that require
exceptionally fast performance.

## Compiled vs Interpreted

A **compiled language** is a language that is converted directly to
machine code then run by the processor. This conversion step is handled
by a **compiler** and is initially slow. However, the machine code runs
relatively quickly. Additionally, compiled programs are less portable -
they have to be recompiled for different architectures and more secure
since reconstructing the source code from the binary files is
difficult.\
An **interpreted language** is a language that's converted to machine
code and run line by line during run time. That is, when I run an
interpreted language, the first line is converted to machine code and
run by the **interpreter** then the second line is compiled and run and
so on. These languages don't have a slow compilation step, but the
overall program runtime is slower (since the conversions happened during
runtime). Additionally, interpreted programs are more portable since the
interpreters are built to convert the source code based on architecture,
and they are less secure since the source code is shipped out as part of
the software.

## Java

Java is a multi-purpose programming language developed by Sun
Microsystems (bought by Oracle) in 1995. It is the most used programming
language in the world. Java is considered a relatively high level
language and is a hybrid compiled / interpreted language. Java source
code is compiled into Java byte code which is then run on top of a Java
Virtual Machine (JVM). The JVMs are architecture specific, but the byte
code is not which means Java can be shipped out in its compiled state.
This means that Java source code can run on any platform and is faster
than a standard interpreted language - Java is still slower than pure
compiled languages like C and C++.

## Java Syntax

### The Hello World Program

```Java
public class Hello {

   public static void main(String[] args) {
        System.out.println("Hello World");
   }
}
```
The first line defines a Java **class** named \"Hello\". The entire
class is contained in the first set of curly brackets.\
The second line is the **header** for the **main method**. The main
method is the place where the computer begins running the program. The
entire method is contained within the second set of curly brackets. The
third line is a print command.

### Printing

There are three major ways to print output to the screen in Java.
-   `System.out.println("Hello World");`\
    Prints the argument (in this case the string Hello World, but could
    be an integer, character, float, double, etc) and moves the cursor
    to a new line.
-   `System.out.print("Hello World");`\
    Prints the argument and doesn't move the cursor to a new line.
-   `System.out.printf("%s", "Hello World");`\
    Prints a string containing format commands (the first argument) and
    doesn't move the cursor to a new line. A formatted command has the
    structure: %\[flags\]\[width\]\[.precision\]conversion-character.
    See the below cheat sheet for a quick reference to the different
    printf commands.\
    <http://web.cerritos.edu/jwilson/SitePages/java_language_resources/Java_printf_method_quick_reference.pdf>

### Data Types

Java technically has an infinite number of data types since Java
programmers can create their own data types. However, all Java data
types are build around a set of basic, **primitive** data types.
-   boolean: represents true or false. Example:
    `boolean b1 = true; boolean b2 = false;`.
-   byte: represents a single 8 bit value (any integer between $-2^7$
    and $2^7$)\
    Example: `byte b1 = 8; byte b2 = 127;`.
-   char: a single Unicode character - in non-programming speak, this is
    a data type that holds a single letter or symbol found in text.
    Example: `char c1 = 'a'; char c2 = '1'; char c3 = '\n';`.
-   short: a 16 bit integer value (any integer between $-2^15$ and
    $2^15$). Example: `short s1 = 8; short s2 = 32767; short s3 = -5;`
-   int: a 32 bit integer value (any integer between $-2^31$ and
    $2^31$). Example: `int i1 = 8; int i2 = 2147483647; int i3 = -20;`
-   long: a 64 bit integer value (any integer between $-2^63$ and
    $2^63$). Example: `long l1 = 8; l2 = 2147483647; long l3 = -10;`
-   float: a 32 bit floating point value. Example
    `float f1 = 10.0; float f2 = 100.323423; flaot f3 = -2132.343;`
-   double: a 64 bit floating point value. Example
    `double d1 = 1.0; double d2 = 1123.3432432; d3 = -4234.324;`

Java - and most other programming language - have a more complex data
type used to hold text. These are called **Strings**. Strings are
\"strings' of characters - essentially the representation of text in a
computer program. Strings are an example of a **non-primitive** data
type. A non-primitive data type is a data type that is made up of
primitive (and other non-primitive data types). Non-primitive data types
are more complex than primitives and are named with their first letter
capitalized. We define a string useing quotation marks:
`String s = "Hello world.";`.

### Variables

A variable is a container or storage location for a value. These
variables only exist while the program is running. A variable has three
components, a type, name and value.
```Java
int luckyNumber = 13;
System.out.println("the lucky number is " + luckyNumber);
System.out.println("and twice that is " + 2*luckyNumber);
```

In line 1 we define a variable (luckyNumber) as an integer (int) which
we can call later in the program.\
We can define a constant or final variable as a variable that cannot be
changed throughout the program. This can be useful for mathematical
constants or specific numbers that aren't changeable. For example, if we
want to create a named constant integer set to the value $1$ we say
`final int one = 1;`

### Keyboard Input

Taking in user input is a crucial part of a computer program since we usually want our programs to make computations and decisions based on
user input.
```Java
import java.util.Scanner; 

public class Variable {

   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in); 
      System.out.print ("Please enter your lucky number ");
      int luckyNumber = keyboard.nextInt();
      System.out.println ("the lucky number is " + luckyNumber);
      System.out.println ("And twice that is " + 2*luckyNumber);
    }
}
```
Line 1 imports the Scanner class from the java library.\
Line 4 defines a new variable \"keyboard\" which is a variable of type Scanner.\
Line 6 defines a new integer as the next integer entered by the user.
This vari able can be called later on in the program.\
You can think of a Scanner as a pipe that we can use to read input and files from different sources. When we set up a Scanner as we did above, the pipe is connected to the Computer's "standard input" (aka the keyboard) and will read input at that location. 
The Scanner object has a few built in methods that can be used to take
in specific types of input. If we declare
`Scanner keyboard = new Scanner(System.in);`:
-   `keyboard.next();`\
    Returns the next word (String up until the next whitespace or
    newline) entered at the console.
-   `keyboard.nextLine();`\
    Returns the next line (String up until the next newline including
    any other whitespace) entered at the console.
-   `keyboard.nextInt();`\
    Returns the next integer entered at the console.
-   `keyboard.nextDouble();`\
    Returns the next double entered at the console.
-   `keyboard.hasNext();`\
    Returns whether or not there is an unprocessed word entered at the
    console.
-   `keyboard.hasNextLine();`\
    Returns whether or not there is an unprocessed line entered at the
    console.

For more Scanner commands see
<https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html>.

### Basic Value Manipulation

One of the main purposes of computers is to perform calculations more
quickly than humans. Java has many operations which can be used to
perform arithmetic, manipulate data, etc.

**Arithmetic Operations**

The arithmetic operations in Java are

-   \+ addition
-   \- subtraction
-   \* multiplication
-   / division
-   \% modulus (remainder)

**Integer Division**

When a value or variable is stored a certain ammount of memory is
allocated based on the type. Thus integers, doubles, floats, strings,
etc cannot be simply interchanged. This doesn't present as a problem
when undergoing addition, subtraction, or multiplication since adding,
subtracting, and multiplying two integers will yield an integer. However
when dividing integers we encounter a problem. Dividing two integers can
yield a decimal number which does not \"fit\" in the memory allocated
for the integers. Thus the computer truncates the number at the decimal
point to ensure that the new number will be stored.\
Thus if we have two integers 3 and 7. According to the compiler 7/3 = 2
However if we want to obtain the \"real\" answer we can say
`7/ (double) 3 = 2.33333`

### The Math Library

Java also has a built in Math package for more complicated mathematical
operations. You're not expected to know the entirity of the Math
package, but there are a few methods which you should know off the top
of your head. Note that while I'm writing these functions with a very
specific set of input arguments, there are equivalent functions for
variables of different data types. For example there is a
`Math.abs(int a)`, a `Math.abs(double a)`, a `Math.abs(long a)`, etc all
of which return the absolute value of the argument / parameter (a).
-   `Math.pow(int a, int b);`\
    Returns $a^b$.
-   `Math.sqrt(int a);`\
    Returns $\sqrt(a)$.
-   `Math.log(double a);`\
    Returns $\log_{e}(a)$.
-   `Math.log10(double a);`\
    Returns $\log_{10}(a)$.
-   `Math.max(int a, int b);`\
    Returns the larger of the two parameters.
-   `Math.min(int a, int b);`\
    Returns the smaller of the two parameters.
-   `Math.abs(double a);`\
    Returns the absolute value of the parameter.
-   `Math.floor(double a);`\
    Returns the largest integer less than the parameter. For example if
    `double a = 4.5`, `Math.floor(a)` returns 4.0.
-   `Math.ceil(double a);`\
    Returns the smallest integer greater than the parameter. For example
    if `double a = 4.5`, `Math.ceil(a)` returns 5.0.

A full list of Math methods can be found at
<https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html>.

### String Manipulation

Java maintains a list of String manipulation methods on their website.
If we have a `String myString = "This is my string!";`:
-   `myString.charAt(2);`\
    Returns the character at index 2 (3rd character) in myString.
-   `myString.substring(5);`\
    Returns the string from index 5 till the end.
-   `myString.substring(1, 5);`\
    Returns the string from index 1 (inclusive) to index 5 (exclusive).
-   `myString.toLowerCase();`\
    Converts the string to lower case.
-   `myString.toUpperCase();`\
    Converts the string to upper case.
-   `myString.contains(str);`\
    Returns true if myString contains str, false if not.
-   `myString.indexOf(str);`\
    Returns the index of the first incidence of the string str in
    myString or -1 if str is not in myString. Can also be called on a
    character.
-   `myString.length();`\
    Returns the length of the string.

A full list of String methods can be found at
<http://docs.oracle.com/javase/7/docs/api/java/lang/String.html?is-external=true>.
