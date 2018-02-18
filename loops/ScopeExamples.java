
/*
 * Demonstrates variable scope.
 * @author Haroon Ghori
 */
public class ScopeExamples {
   
   public static void main(String[] args) {
      int outerVar = 1;
      if (true) {
         System.out.printf("outerVar is visible and = %d.\n", outerVar);
         outerVar = 10;
      }
      System.out.printf("now outerVar = %d.\n", outerVar);
      if (outerVar > 0) {
         int inIfVar = 2;
         System.out.printf("inIfVar is visible and = %d.\n", inIfVar);
      }
      // System.out.println("inIfVar = %d", inIfVar); // FAILS inIfVar out of scope
      
      // A variable defined inside a block (set of curly braces) is only visible inside that block.
      // That includes any sub-blocks.
      // This is called variable scope. 
      for (int i = 0; i < 10; i++) {
         System.out.print("*");
      }
      System.out.println();
      //System.out.printf("Is i in scope? i = %d", i);
      int j;
      for (j = 0; j < 10; j++) {
         System.out.print("+");
      }
      System.out.println();
      //System.out.printf("Is j in scope? j = %d", j);
  }

}