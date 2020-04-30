public class Rochambeau {
   private static int ROCK = 0;
   private static int PAPER = 1; 
   private static int SCISSORS = 2;  

   public static int getWinner(int throw1, int throw2) {
      int result;     
      
      if (throw2 > 2) {
         System.out.println("Invalid Input");
         System.exit(0);
      } 
      if (throw2 < 0) {
         System.out.println("Invalid Input");
         System.exit(0);
      }
      if (throw1 == throw2) {
         result = 0;
      }
      else if (throw1 == 0 & throw2 == 2) { 
         result = 1; 
      }
      else if (throw1 == 2 & throw2 == 0) {
         result = -1;
      }
      else if (throw1 > throw2) {
         result = 1;
      }
      else {
         result = -1;
      }
      System.out.println();
      return result; 
   }
}

