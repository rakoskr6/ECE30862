import java.lang.Integer;

class Int implements Comparable {

   Integer i;

   public Int(int j) {i = new Integer(j);}

   // Implement the Comparable interface functions here.
   public double value(){  
      return 1;
      
   }
  
   public boolean lessThan(Comparable c){  
      if (this.value < c.value) {
         return true;
      }
      else {
         return false;
      }
   }
  
   public boolean equal(Comparable c){  
      if (this.value == c.value) {
         return true;
      }
      else {
         return false;
      }
   }
  
   public boolean greaterThan(Comparable c){ 
   if (this.value > c.value) {
         return true;
      }
      else {
         return false;
      }
      
   }

}
