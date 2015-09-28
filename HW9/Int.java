import java.lang.Integer;

class Int implements Comparable {

   Integer i;

   public Int(int j) {
	   i = new Integer(j);
	   }

   // Implement the Comparable interface functions here.
   public double value(){  
      return i;
      
   }
  
   public boolean lessThan(Comparable c){  
      if (this.i < c.value()) {
         return true;
      }
      else {
         return false;
      }
   }
  
   public boolean equal(Comparable c){  
      if (this.i == c.value()) {
         return true;
      }
      else {
         return false;
      }
   }
  
   public boolean greaterThan(Comparable c){ 
   if (this.i > c.value()) {
         return true;
      }
      else {
         return false;
      }
      
   }

}
