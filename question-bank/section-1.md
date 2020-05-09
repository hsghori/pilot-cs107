1. What is printed? Where is the cursor?
    1. `System.out.print("Hello");`
    2. `System.out.println(1 + 2 + "abc");`
    3. `System.out.println("abc" + 1 + 2);`
    4. `System.out.println("abc" + " def\n")`
    5. `System.out.printf("%d - %d - %s\n", 1, 2, "abc");`
    6. `System.out.printf("%.2f 03.1f", .1, 9.816);`
2.  What is the value of z after the following code executes?
    1. `int z = (20 + 30) * 10 / 3;`
    2. `int x = 5; int y = 10; int z = ++x * y--;`
3.  Evaluate the following boolean expressions
    1. `true && (('a' > 'Z') || (10 < -15 + 8)) && !true || !(false || !!true)
       && false`
    2. `(Math.pow(2, 3) > Math.pow(3, 2)) || (10 / 3 > 1000)`
    3. `(10 == 10) && (new String("foo") == new String("foo"))`
4. Write a Java program that generates a random integer n in the inclusive
range $-10...30$ and perform the following conditional actions:
    - If n is odd, print `Weird`
    - If n is even and in the inclusive range of 2 to 5, print `Not Weird`
    - If n is even and in the inclusive range of 6 to 20, print `Weird`
    - If n is even and greater than 20, print `Not Weird`
5.  Write a Java program to detect key presses. If the user pressed number
    keys( from 0 to 9), the program will print the number that is pressed,
    otherwise, program will print `Not allowed`.
6.  Implement division with resolution .1 without using the $/$ operator.
7.  In the decimal number system) an n-digit integer can be written as
    $10^{n-1} * val_{n-1} + 10^{n-2} * val_{n-2} + … + 10^{1} * val_{1} +
    10^{0} * val_{0}$ (note that we index digits starting at 0) where $0 \leq
    val_{x} < 10$. So, the number
    $1234 = 10^3 * 1 + 10^2 * 2 + 10^1 * 3 + 10^0 * 4$. The binary number
    system uses 2 instead of 10 as a base and the value of each digit is
    either 0 or 1 (ie less than 2). Convert an integer from decimal to a
    string representing its equivalent in binary.\
    Examples:

    ```Java
    // 10 = 1 * 10^1 + 0 * 10^0
    // 10 -> "1010" = 1 * 2^3 + 0 * 2^2 + 1 * 2^1 + 0 * 2^0
    System.out.println( convertToBinary(10) );
    // "1010"
    System.out.println( convertToBinary(2) );
    // "10"
    System.out.println( convertToBinary(346) );
    // "101011010"
    ```

8.  A random walk is a particular kind of probabilistic simulation that models
    certain statistical systems such as Brownian motion of molecules.  You
    can think of a one-dimensional random walk in terms of coin flipping.  If
    you flip a coin as heads $x \geq .5$ you take a step forward.  If you
    flip a coin as tails $x < .5$ you take a step back.  Write a program that
    takes as input the number of steps for a random walk, and the number of
    times to simulate it "nsim".  Calculate the average distance (in steps)
    from the origin.
9.  Write a method called "compressString" which compresses a string such that
    any consecutive repeated characters are replaced with one of the
    character and the number of times the character is repeated. This is
    also known as "Run length encoding". \
    Examples:

    ```Java
    System.out.println( compressString("aaabbc") );
    // "a3b2c"
    System.out.println( compressString("abc") );
    // "abc"
    System.out.println( compressString("aaqakkaccc") );
    // a2qak2a2c3
    ```

10. Given an input file bmi.txt where each line is of the form

    ```
    <Sex> <Height> <Weight>
    ```

    Where `<Sex>` is a string (Male or Female) and `<Height>` and
    `<Weight>` are doubles. Print to the average BMI of each sex to the
    screen.
    $$BMI = \frac{Weight * 703}{Height^2}$$

11. Given the same file (bmi.txt) output one line per person of the form

    ```
    <Sex> <BMI> <Z-score>
    ```

    Note that:
    $$Zscore_{i} = \frac{(x_{i} - \mu)}{\sigma}$$
    $$\sigma = \sqrt{ \frac{ \sum_{i=0}^{N}{ (x_{i} - \mu)^2 } } { N-1 } }$$
    $$\mu = \frac{\sum_{i=0}^{N}{x_{i}}}{N}$$

    Calculating the z-score may require reading the file more than once. In a
    few weeks you'll learn about arrays which will make this process more
    efficient.
