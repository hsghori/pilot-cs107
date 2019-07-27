# Notes: File IO

We often want to read data from a file and / or write data to a file. To
read data from a file we use the Scanner and FileReader classes. We
declare the Scanner similarly to how we declare a Scanner to read from
the keyboard
```Java
import java.util.Scanner;
import java.io.FileReader;
impor java.io.IOException;

public class IOExampleInFile {
    
    public static void main(String[] args) throws IOException {
        Scanner inFile = new Scanner(new FileReader("infile.txt"));
        // read from the file using next(), nextLine(), nextDouble(), nextInt(), etc.
        inFile.close(); // not strictly necessary when reading from the file
    }
}
```
In this case `infile.txt` is the name of the file we want to open. We can now treat inFile the same way as we treated the Scanners that were reading input from the keyboard. We can call `infile.next()`, `infile.nextLine()`, `infile.nextInt()`, and `infile.nextDouble()` and expect the same kind of behavior
as if we were reading input from the keyboard.  
There are also a couple of methods that we can use to determine how long to read a file:
- `infile.hasNext()` : returns true if there is a next word in the file
- `infile.hasNextLine()` : returns true if there is a next line in the file
- `infile.hasNextInt()` : returns true if the next element in the file is an int
- `infile.hasNextDouble()` : returns true if the next element in the file is a double

Using these methods I can read from a file line by line, word by word, etc. 

For example to read a file line by line and print each line to the screen:
```Java
Scanner infile = new Scanner(new FileReader("infile.txt"));
while (infile.hasNextLine()) {
    String line = infile.nextLine();
    System.out.println(line);
}
```
The example above reads a file line by line.

To write data to a file we use PrintWriter and
FileWriter objects which are declared as follows. 
```Java
import java.io.PrintWriter:
import java.io.FileWriter;
import java.io.IOException;

public class IOExampleOutFile {
    
    public static void main(String[] arge) throws IOException {
        PrintWriter outFile = new PrintWriter (newFileWriter("output.txt"));
        // write to the file
        outFile.close();
    }
}
```
Writing to a `PrintWriter` is very similar to printing to the screen - in fact `PrintWriter` has the same methods as `System.out` so you can call `outfile.print()`, `outfile.println()`, or `outfile.printf()` the same way you'd call `System.out.print()`, `System.out.println()`, or `System.out.printf()`. When you're done writing to an output file you have to call `close()` on the PrintWriter - otherwise the file may not save. 

For example if I wanted to write a bunch of integers to a file:
```Java 
PrintWriter outFile = new PrintWriter(new FileWriter("output.txt"));
for (int i = 1; i < 2048; i*=2) {
    outFile.printf("%d\n", i);
}
outFile.close();
```

Putting these together - here is an example of copying a file line by line to some output file. 
```Java
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOEXception;
import java.io.PrintWriter;
import java.io.FileWriter;

public class IOExample {

    public static void main(String[] args) throws IOException {
        Scanner inFile = new Scanner(new FileReader("input.txt"));
        PrintWriter outFile = new PrintWriter (newFileWriter("output.txt"));
        // to find all integers in the file
        while (inFile.hasNextLine()) {
            outFile.println(inFile.nextLine());
        }
        /* 
        for the while loop we can also use ioFile.hasNext for strings, inFile.hasNextLine for and entire file, ioFile.hasNextDouble for doubles 
        */
        outFile.close() // closes the output file
    }
}
```
