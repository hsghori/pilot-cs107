# Notes: Static Methods

In java a method is a self contained piece of code that performs a
specific task. For example, say we're writing a program that inputs a
time and incriment and outputs the ending time. We could write
everything in the main method
```Java
import java.util.Scanner;

public class TimeAdditionOne {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String time = kb.nextLine();
        String inc = kb.nextLine();
        int timeHrs = Integer.parseInt(time.subString(0, 2));
        int timeMns = Integer.parseInt(time.subString(3));
        int incHrs = Integer.parseInt(inc.subString(0, 2));
        int incMns = Integer.parseInt(inc.subString(3));
        int finalMins = (timeMns + incMns) % 60;
        int overflowHrs = (timeMins + incMins) / 60;
        int finalHrs = (timeHrs + incHrs + overflowHrs) % 24;
        System.out.printf("The final time is %d:%d", finalHrs, finalMins);
    }   
}
```

But this can be a bit hard to read. And if we're writing a program that
uses this kind of calculation a lot - for example, a calendar app or a
stopwatch - copying and pasting this code everywhere can be tedious.
Furthermore, if we wanted to alter this method (say to output time in
12hr format instead of 24hr format), we'd have to change every instance
of this code in the main method.\
Instead, we can write a helper method that performs this calculation and
call that method wherever we want to add a time increment to a current
time.

So our time addition program could be rewritten:
```Java
import java.util.Scanner;

public class TimeAdditionTwo {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String userTime = kb.nextLine();
        String userInc = kb.nextLine();
        String finalTime = computeTimeAddition(userTime, userInc); // method call
        System.out.println(finalTime);
    }

    public static String computeTimeAddition(String time, String inc) {
        int timeHrs = Integer.parseInt(time.subString(0, 2));
        int timeMns = Integer.parseInt(time.subString(3));
        int incHrs = Integer.parseInt(inc.subString(0, 2));
        int incMns = Integer.parseInt(inc.subString(3));
        int finalMins = (timeMns + incMns) % 60;
        int overflowHrs = (timeMins + incMins) / 60;
        int finalHrs = (timeHrs + incHrs + overflowHrs) % 24;
        return String.format("%d:%d", finalHrs, finalMins);
    }
}
```
A few notes:
-   This is a lot easier to read than the first piece of code. It's a
    lot easier to follow what the main method is trying to accomplish
    (especially if we use descriptive method names).
-   Any methods defined in the **same class** automatically recognize
    each other. Notice how in the main method I can just call
    `computeTimeAddition`. This is not true when a method is described
    in a different class.
-   We can now reuse `computeTimeAddition` anywhere else in this
    program. And if we want to modify the functionality we just need to
    modify one code block instead of many.

Any method in Java is defined in the following way:
```
<public / private / protected> <static (optional)> <return type> <method name>(<parameters>) {
    // statements
    return <value>;
}
```

-   `<public / private / protected>` : Defines which external classes
    can see this method. Use public for now.
-   `<static>` : Don't worry about this for a bit. All your methods will
    be static for the next few weeks.
-   `<return type>` : The type (int, double, String, etc) of value this
    method will return to the caller when the method finishes its task.
    If the method doesn't return anything (ie it just prints or reads
    file input or something like that) its return type is `void`.
-   `<method name>` : The name of the method. This should be a
    reasonably descriptive name and should be formatted in camel-case.
-   `<parameters>` : Declarations of variables that this method will
    take as input. Note that these should be reasonably descriptive
    names. The names of the variables don't need to match the names of
    the variables being passed to the method by the caller. If the
    method takes no parameters this can be left blank.

For example:
```Java
public static double findMin(double x, double y, double z) { 
    double minXandY = Math.min(x, y);
    return Math.min(z, minXandY);
}
```

This method:
-   is `public` and `static`.
-   returns a value of type `double` to the caller.
-   is named findMin.
-   takes three doubles as arguments / parameters.

If I want to find the minimum of three doubles in the main method then I
can use:
```
import java.util.Scanner;

public class Example {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double valOne = kb.nextDouble();
        double valTwo = kb.nextDouble();
        double valThree = kb.nextDouble();
        double min = findMin(valOne, valTwo, valThree);
        System.out.println("The minimum is " + min);
    }

    public static double findMin(double x, double y, double z) { 
        double minXandY = Math.min(x, y);
        return Math.min(z, minXandY);
    }
}
```

Methods don't need to take in parameters:
```Java
public static int rollDi() {
    Random rand = new Random();
    return rand.nextInt(6) + 1;
}
```

And methods don't need to return anything (in this case they return void):
```Java
public static void flipCoin() {
    Random rand = new Random();
    flip = rand.nextInt(2);
    if (flip == 1) {
        System.out.println("Heads!");
    }
    else {
        System.out.println("Tails!");
    }
}
```

When the `return` keyword is called, the method ends and returns the
value after the `return`. We can use this in behavior to eliminate some
else statements.

    public static void flipCoin() {
        Random rand = new Random();
        flip = rand.nextInt(2);
        if (flip == 1) {
            System.out.println("Heads!");
            return;
        }
        System.out.println("Tails!");
    }

These two methods are equivalent, but the second is a bit cleaner and
less verbose.

## Introduction to Pass by Reference-Value

When I pass a primitive or String variable to a method in Java, the
variable itself isn't sent to the method. The value in the variable is
copied into a new variable which has scope of the method. So if I change
a primitive or String variable in an external method it doesn't affect
the value of the corresponding variable in the caller method.
```Java
public static void main(String[] args) {
    int x = 10;
    int inc = 5;
    System.out.printf("x: %d, inc: %d", x, inc\n);
    add(x, inc);
    System.out.printf("x: %d, inc: %d", x, inc\n);
}

public static void add(int x, int inc) {
    x += inc
}
```

In this example, the program should output
```
x: 10, inc: 5
x: 10, inc: 5
```

This is because:
1.  Two variables, x and inc were declared and defined in the main
    method. We will refer to these as x_main and inc_main.
2.  We print the values of x_main and inc_main.
3.  We call `add` on x_main and inc_main.
    1.  The value in x_main is copied and sent to a new place in
        memory. A new variable (also called x) which we will refer to as
        x_add is declared and defined to be equal to the value of
        x_main.
    2.  The value in $inc_{main}$ is copied and sent to a new place in
        memory. A new variable (also called x) which we will refer to as
        inc_add is declared and defined to be equal to the value of
        $inc_{main}$.
    3.  x_add is set equal to x_ + inc_{add}.
4.  We call add on x_main and inc_main.

Observe how even though the main method AND the add method have
variables called x and inc, those variables are not linked. Changing the
x in add does not affect the value of the x in main.

**Note:** There is another layer to this that we will talk about in a
few weeks.

## Javadoc Comments

Javadoc comments are special comments that are used to auto-generate
documentation for your code. Every class, method, and \"member
variable\" (ignore that last one for now) must have a javadoc comment -
and they must be formatted in a very specific way. The javadoc comment
for a method takes the form

    /**
     <First sentence giving a general description of what the method does - this must end with a period ".">
     <Any number of more descriptive sentences>
     @param <name of parameter 1> <description of parameter 1>
     @param <name of parameter 2> <description of parameter 2>
     <... do for all parameters>
     @return <description of what the method returns. Don't do this for void methods>
     */

For example, our time addition method from above could have the javadoc
comment:

    /**
     * Adds a time increment to a given 12hr clock time. 
     * @param time the string representing the user entered time
     * @param inc the string representing the increment to be added to time
     * @return A string representing time + inc in 12hr time
     */ 
    public static String computeTimeAddition(String time, String inc) {
        int timeHrs = Integer.parseInt(time.subString(0, 2));
        int timeMns = Integer.parseInt(time.subString(3));
        int incHrs = Integer.parseInt(inc.subString(0, 2));
        int incMns = Integer.parseInt(inc.subString(3));
        int finalMins = (timeMns + incMns) % 60;
        int overflowHrs = (timeMins + incMins) / 60;
        int finalHrs = (timeHrs + incHrs + overflowHrs) % 24;
        return String.format("%d:%d", finalHrs, finalMins);
    }

