# Section 2 - Helper Methods, Recursion, Arrays, Instantiable Classes

1. Write a Java class named Mirror which contains a main method that collects a line of
input from the user and then determines and outputs the longest sequence of
characters at the start of the line which is a mirror image of the sequence of characters
at the very end of the line. The mirror image sequences of characters are permitted to
overlap.
2. Write a method `int[] getTime()` that prompts the user to enter the time in hours and
then minutes separately, then returns and int array of length two, which holds the
number of hours in the 0th index and minutes in the first index.
3. Suppose you are standing at the base of a staircase and are heading to the top. A small
stride will move up one stair, and a large stride advances two. You want to count the
number of ways to climb the entire staircase based on different combinations of large
and small strides. For example, a staircase of three steps can be climbed in three
different ways: three small strides, one small stride followed by one large stride, or one
large followed by one small.
4. Write a Java class called Stairs which contains a static void method named
waysToClimb that takes only an integer value representing a number of stairs
and using recursion prints to the screen each unique way to climb a staircase
of that height, taking strides of one or two stairs at a time. The use of loops is not
Allowed.\
For example, `Stairs.waysToClimb(3)` will produce

    ```
    [1, 1, 1]
    [1, 2]
    [2, 1]
    ```

5. Consider the following incredibly simple methods:

    ```Java
    /* Increment the given integer by one */
    public static int inc(int a) {
    return a + 1;
    }
    /* Decrement the given integer by one */
    public static int dec(int a) {
    return a - 1;
    }
    ```

Using these methods as helpers, implement the following methods recursively
without any mathematical operators (+,-,/,%,++,--, etc.).\
Comparison operators are allowed.

    ```Java
    /* Compute a + b */
    public static int add(int a, int b);
    /* Compute a * b */
    public static int mul(int a, int b);
    /* Compute a ^ b */
    public static int pow(int a, int b
    ```

6. Write a method to check if an array of positive integers is sorted (recursively).
7. Create a class from the following skeleton, and implement the methods:

    ```Java
    public class Time {
        public final int hours;
        public final int minutes;

        /* Construct a new time object. Throw an exception
        * if hours or minutes are not within a valid range:
        * (0-23 for hours, 0-59 for minutes)
        * @param hours The number of hours
        * @param minutes The number of minutes
        */
        public Time(int hours, int minutes) {
            /* implementation not shown */
        }

        /* Make a string in `hhmm` format (military time)
        public String toMilitaryString();

        /* Make a string in `hh:mm (AM/PM)` format
        public String toString();

        /* Creates a new time which is the sum
        * of this and the increment time.
        * @param increment The time to add
        * @return A new time, which is this + increment.
        */
        public Time add(Time increment) {
            /* implementation not shown */
        }

        /* Create a new time which represents how much
        * time remains until a deadline starting at the current time.
        * @param deadline The target time
        * @return The duration of time between this time and the deadline
        */
        public Time until(Time deadline) {
            /* implementation not shown */
        }

        /* Compare two Times.
        * @param other The time to compare to this time
        * @return An integer representing the relationship:
        * -1 if this < other
        * 0 if this == other
        * 1 if this > other
        */
        public int compareTo(Time other) {
            /* implementation not shown */
        }
    }
    ```

8. Write a class Dog to represent a dog. You will need to include the following
specifications: name, age, and breed. The constructor for the class Dog should take in a
String parameters for the name and breed. It should also set the age to 0. Write a void
method called aged that increments age.
9. The class Movie is started below. An instance of class Movie represents a film. This
class has the following three class variables:
    - title , which is a String representing the title of the movie
    - studio , which is a String representing the studio that made the movie?
    - rating , which is a String representing the rating of the movie (i.e.PG, PG 13, R, etc)

    ```Java
    public class Movie {

    private String title;
    private String studio;

    private String rating;
        // your code goes here
    }
    ```

    - Write a constructor for the class Movie , which takes a String representing the
    title of the movie, a String representing the studio, and a String representing the
    rating as its arguments, and sets the respective class variables to these values.
    - Write a second constructor for the class Movie , which takes a String
    representing the title of the movie and a String representing the studio as its
    arguments, and sets the respective instance variables to these values, but sets the
    instance variable rating to "PG".
    - Write a code segment that creates an instance of the class Movie with the title
    “Black Panther”, the studio “Marvel Studios”, and the rating “PG 13”. This segment
    might appear in a main method, for example .
    - Write a Movie class instance method getPG , which takes an array of base type
    Movie as its argument, and modifies the array so that at the end of the method, only
    those movies in the input array with a rating of "PG" remain. You may assume the input
    array is full of Movie instances. The returned array need not be full, so the method will
    return to the calling method an int representing the number of movies remaining in
    the array.
10. Write java methods `double[] addVectors(double[] a, double[] b)` , `double[]
subtractVectors(double[] a, double[] b)` , and `double dotProduct(double[] a,
double[] b)` to compute the pairwise sum, difference, and dot product of two arrays a
and b.
    - Given arrays a and b, the pairwise sum of a and b is an array c such
    that $c[i] = a[i] + b[i]$.
    - Given arrays a and b, the pairwise difference of a and b is an array
    c such that $c[i] = a[i] - b[i]$.
    - Given arrays a and b, the dot product of a and b is a double c such that
    $c = \sum_{i=1}^{n}{a[i]* b[i]}$.
11. Two vectors are linearly dependent if one is a scalar multiple of the other. That is,
vectors V and w are linearly dependent if there exists a scalar c such that v = cw . Write a
method boolean areDependent(int[] v, int[] w) that determines if v and w are
linearly dependent.
12. Conway’s Game of Life is a cellular automaton game devised by the British
Mathematician John Horton Conway. The original game is a zero player game. The
evolution of it depends entirely on its input. Game of life takes place on a 2D grid. Each
cell in the grid will be in one of the two possible states, ALIVE (1) or DEAD (0). The birth
or death of the cells is based on the following rules.
- A cell switches from DEAD to ALIVE if its surrounded exactly by 3 living cells.
- A cell remains alive if its surrounded by 2 or 3 living cells.
- A cell switches from being ALIVE to DEAD if its surrounded by more than 3 living cells
because of overpopulation.
- A cell switches from being ALIVE to DEAD if its surrounded by less than 2 cells because
of under population.
Assume that the array “wraps around” so that each cell is surrounded by 8 cells, 4 on its
sides and 4 on its corners. For example, ie in a 4x4 grid the neighbors of cell 0, 0 are (3,
3), (3, 0), (3, 1), (0, 3), (0, 1), (1, 3), (1, 0), and (1, 1).
Write a function `boolean[][] conwaysGame(boolean[][] grid, int numIters);`
that returns the state of the grid after numIters iterations of Conway’s Game of Life.
13. Suppose a company represents their employees’ offices as a String[][], where each
String represents who occupies a certain cubicle (and empty string means an empty
cubicle). This company wants to rearrange their office to fit a new building. Write a
static method
`String[][] reshape(String[][] offices, int rows, int cols)`
which reorganizes the values into a new array with type `String[rows][cols]`
representing the position of each employee in the new building. To save space,
employees should be placed as closely in the new building as possible, so empty
cubicles should be skipped over when moving to the new office. If the new office is
too small, the remaining employees can be forgotten (laid off). If the new office is
too big, any extra cubicles should have the empty string.\
EXAMPLE 1:
```
reshape(
    {
        {“A”, “B”, “”, “C”, “D” },
        {“E”, “”, “”, “F”, “G”, “H”},
        {“”, “”, “I”, “J” },
        {“K”}
    },
    5, 3)
OUT >>
{
    { “A”, “B”, “C” },
    { “D”, “E”, “F” },
    { “G”, “H”, “I” },
    { “J”, “K”, “” },
    { “”, “”, “” }
}
```
EXAMPLE 2:
```
reshape(
    {
        {“A”, “B”, “”, “C”, “D” },
        {“E”, “”, “”, “F”, “G”, “H”},
        {“”, “”, “I”, “J” },
        {“K”}
    },
    2, 4)
OUT >>
{
    { “A”, “B”, “C”, “D”},
    { “E”, “F”, “G”, “H”}
}
```
14. A rectangular grid is column-magic if each column of grid has the same sum. Write a
method boolean `isColumnMagic(int[][] grid)` that returns true if grid is column-magic
and false otherwise.
