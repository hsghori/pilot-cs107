import java.util.Scanner;
import java.util.Random;
/** javadoc.*/
public class RandomAndControlClow {

   /** Main method.
    * @param args command line args
    */
   public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);
      
      // Random
      System.out.println("Showing random number generator");
      Random gen = new Random();
      System.out.print("High: ");
      double high = kb.nextDouble();
      System.out.printf("Low: ");
      double low = kb.nextDouble();
      int randInt = gen.nextInt((int)high - (int)low + 1) + (int)low;
      double randDouble = gen.nextDouble() * (high-low) + low;
      System.out.printf("A random number between %f and %f is %d\n", low, high, randInt);
      System.out.printf("A random double between %f and %f is %f\n", low, high, randDouble);
      
      // If, Else, RaSwitch Statements
      String word = "terrific";
      int pos = kb.nextInt(); 
      char charAt = word.charAt(pos);
      if (charAt == 'r') {
         System.out.println("1");
      }
      else if (charAt == 't') {
         System.out.println("2");
      }
      else if (charAt == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o' || charAt == 'u') {
         System.out.println("3");
      }
      else {
         System.out.println("4");
      }
      
      switch (charAt) {
         case 'r':
            System.out.println("1");
            break;
         case 't':
            System.out.println("2");
            break;
         case 'a':
         case 'e':
         case 'i':
         case 'o':
         case 'u':
            System.out.println("3");
            break;   
         default: 
            System.out.println("4");
            break;
      }
   }
   
}