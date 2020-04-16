import java.util.Random;
import java.lang.Object;

public class RochambeauPlayer {

   private String name;
   private int total_wins = 0;
   private int last_throw;
   
   //Constructor
   public RochambeauPlayer(java.lang.String myName) {
      name = myName;
      //total_wins = 0;
   }
   
   public java.lang.String getName() {
      return name;
   } 

   public int getWins() {
      return total_wins;
   }
   
   public void incrementWins() {
      total_wins++;
   }

   public java.lang.String lastThrow() {
      String result;
      if (last_throw == 0) {
         result = "Rock";
      }
      else if (last_throw == 1) {
         result = "Paper";
      }
      else if (last_throw == 2) {
         result = "Scissors"; 
      }
      else {
         result = "No Throw";
      }
      return result;
   }        
      
   public int makeThrow() {
      Random rand = new Random();
      last_throw = rand.nextInt(3);
      return last_throw;
   }
   
   public int makeThrow(int throwType) {
      last_throw = throwType;
      return last_throw;
   }
   
   public java.lang.String toString() {
      String result;
      if (total_wins != 1) {
         result = name + " has " + total_wins + " wins"; 
         }
      else {
         result = name + " has 1 win"; 
         }
      return result;    
   }
}

