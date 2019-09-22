# Code Style

Writing code is difficult. But reading code can be just as difficult. Trying to understand another programmer's
(or even your own) logic can be quite difficult - especially if you don't write your code in a clean, easy to
read way. Code style is a very opinionated topic and varies between different companies, programming languages,
programming frameworks, etc. You may find that what is considered "good" or "acceptable" code style in one class
or company is not acceptable in another situation. However, there are a few general rules new programmers can
follow to write clean, easy to read code that is easily understandable months or years after it's written.

Let's consider the following code snippet.
```Java
public static double someCalculation(a, b, c)
{
if (a < 0) {
return -1;
} else if (b < 0) {
    return -2;
}
else if (c < 0) {
return -3;
}
else {
return 6.67 * math.pow(10, -11) * a * b / math.pow(c, 2);
}
}
```

What does this code snippet do? How long did it take you to figure that out? Now let's consider some easy ways
we can improve this code snippet.

1. Use consistent and correct indentation and brackets. Using nonstandard indentation and bracket styles makes
   your code really difficult to read.
    ```Java
    public static double someCalculation(a, b, c) {
        if (a < 0) {
            return -1;
        } else if (b < 0) {
            return -2;
        }
        else if (c < 0) {
            return -3;
        }
        else {
            return 6.67 * math.pow(10, -11) * a * b / math.pow(c, 2);
        }
    }
    ```
2. Use meaningful variables names.

   Using single letter or unmeaningful variable names (like "temp" or "someString") makes your code difficult to
   read later on. When choosing variable names you should err on the side of being too descriptive rather than
   being too vague or abbreviated. For example `m1` is a bit vague, but `objectOneMass` is very clear - both
   convey the same idea, but the second name is much more obvious - especially if you're coming back to the code
   after a while.
    ```Java
    public static double someCalculation(objectOneMass, objectTwoMass, distanceBetweenObjects) {
        if (objectOneMass < 0) {
            return -1;
        } else if (objectTwoMass < 0) {
            return -2;
        }
        else if (distanceBetweenObjects < 0) {
            return -3;
        }
        else {
            return 6.67 * math.pow(10, -11) * objectOneMass * objectOneMass / math.pow(distanceBetweenObjects, 2);
        }
    }
    ```
3. Use meaningful function names.

   This directly follows from the last point. Function names should describe what
   the function is trying to accomplish. Use the same convention as with variable names - err on the side of
   being overly descriptive.
   ```Java
    public static double calculateGravitationalForce(objectOneMass, objectTwoMass, distanceBetweenObjects) {
        if (objectOneMass < 0) {
            return -1;
        } else if (objectTwoMass < 0) {
            return -2;
        } else if (distanceBetweenObjects < 0) {
            return -3;
        } else {
            return 6.67 * math.pow(10, -11) * objectOneMass * objectOneMass / math.pow(distanceBetweenObjects, 2);
        }
    }
    ```
4. Avoid magic numbers.

   A "magic number" is a constant that is used directly in your code (not assigned to a
   variable). In this case `6.67`, `10`, `-11`, and `2` are all magic numbers. If the person reading this code
   doesn't know much about the domain (in this case physics) they won't know what these numbers and be confused.

   In this case we can clean up some of the magic numbers.
   ```Java
   final static double GRAVITATIONAL_CONSTANT = 6.67 * math.pow(10, -11);

    public static double calculateGravitationalForce(objectOneMass, objectTwoMass, distanceBetweenObjects) {
        if (objectOneMass < 0) {
            return -1;
        } else if (objectTwoMass < 0) {
            return -2;
        } else if (distanceBetweenObjects < 0) {
            return -3;
        } else {
            return GRAVITATIONAL_CONSTANT * objectOneMass * objectOneMass / math.pow(distanceBetweenObjects, 2);
        }
    }
    ```
5. Avoid unnecessary else statements. Oftentimes you can return early or throw an exception from inside a
   conditional statement which negates the need for an else block.
    ```Java
   final static double GRAVITATIONAL_CONSTANT = 6.67 * math.pow(10, -11);

    public static double calculateGravitationalForce(objectOneMass, objectTwoMass, distanceBetweenObjects) {
        if (objectOneMass < 0) {
            return -1;
        } else if (objectTwoMass < 0) {
            return -2;
        } else if (distanceBetweenObjects < 0) {
            return -3;
        }
        return GRAVITATIONAL_CONSTANT * objectOneMass * objectOneMass / math.pow(distanceBetweenObjects, 2);
    }
    ```
6. Use Exceptions when appropriate. Returning nonstandard values (like `-1` and `null`) can cause confusion very
   easily. However, throwing exceptions makes error cases very clear and obvious.
    ```Java
   final static double GRAVITATIONAL_CONSTANT = 6.67 * math.pow(10, -11);

    public static double calculateGravitationalForce(objectOneMass, objectTwoMass, distanceBetweenObjects) throws Exception {
        if (objectOneMass < 0) {
            throw Exception("objectOneMass is invalid")
        } else if (objectTwoMass < 0) {
            throw Exception("objectTwoMass is invalid")
        } else if (distanceBetweenObjects < 0) {
            throw Exception("distanceBetweenObjects is invalid")
        }
        return GRAVITATIONAL_CONSTANT * objectOneMass * objectOneMass / math.pow(distanceBetweenObjects, 2);
    }
    ```

After applying these simple rules, our small code snippet is much and easier to read.

A few more general rules to consider.
1. Keep individual lines under 100 characters. Long lines can break up the flow of reading your code as you're
   forced to scroll horizontally to capture the full logic in the line. You can avoid long lines by breaking the
   code in one line over multiple lines or using variables to break up long calculations into stages.
2. Keep your functions short. Utility functions should really only do one thing. They should not be overly long
   and complicated or contain multiple logical steps. If you find your functions are too long, look for sub steps
   that you can break out into another function.
3. Make sure your function names are consistent with what they do. For example, a function called
   `validateUserInput` shouldn't return some formatted version of the user input. It should validate the input
   and either return a boolean (whether or not the input is valid) or raise an exception on invalid input. A
   function `processUserInput` could validate the input, then format it as needed and return the formatted
   input.
   ```Java
   public static String processInput(String userInput) throws Exception {
       boolean isInputValid = validateInput(userInput);
       if !isValidInput {
           throw new Exception("Input was not formatted correctly");
       }
       return formatInput(userInput);
   }
   ```
4. Avoid over commenting. Some novice programmers will put a comment on every line which clutters up the code and
   actually makes it harder to read. If you write clean code, you shouldn't need to add excessive comments.

## Code Linters

There are several tools that can assess if your code conforms to an intended style. You can integrate these tools
into your IDE or text editor to catch style errors in your code. For Java,
[CheckStyle](https://checkstyle.sourceforge.io) is a very popular code style checking tool.
