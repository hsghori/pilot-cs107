import java.util.Random;

/**
 * Demonstrates basic loop concepts in Java.
 * @author Haroon Ghori
 */
public class LoopExamples {
   
   /**
    * Main method.
    * @param args Command line arguments 
    */
   public static void main(String[] args) {
      // a for loop is used to loop over a specific range
      // of values
      
      System.out.println("Basic for loop.");
      for (int i = 0; i < 10; i++) {
         System.out.printf("%d ", i);
      }
      System.out.println("\nFor loop with exponential increase.");
      for (int j = 1; j <= 2048; j*=2) {
         System.out.printf("%d ", j);
      }
      
      // a while loop is used to loop over conditions that 
      // aren't easily represented by a range
      Random gen = new Random();
      System.out.println("\nWhile loop - continues until di rolls a 3.");
      int roll = gen.nextInt(6) + 1; // simulate rolling a 6 sided di
      while (roll != 3) {
         System.out.printf("%d ", roll);
         roll = gen.nextInt(6) + 1; // comment this line to demonstrate infinite while
      }
      
      // a do while loop is like a while loop, but 
      // the body is evaluated before checking the condition
      System.out.println("\nWhile loop - continues until di rolls a 3.");
      int rollTwo = 3;
      do {
         System.out.printf("%d ", rollTwo);
         rollTwo = gen.nextInt(6) + 1;
      } while (rollTwo != 3);
      
      // For and do-while loops are really just while loops with more
      // convenient syntax
      
      // For to while
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
      // we can also nest loops within each other to get 
      // interesting behaviors
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
   }
}