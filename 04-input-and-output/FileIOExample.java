import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;

public class FileIOExample {

   public static void main(String[] args) throws IOException {
      Scanner in = new Scanner(new FileReader("input.txt"));
      PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
      while (in.hasNextInt()) {
         out.printf("%d\n", in.nextInt());
      }
      out.close();
   }
}