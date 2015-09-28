import java.lang.Float;

class Flt implements Comparable {

   Float f; // the value returned by the value method.

   public Flt(float f) {this.f = new Float(f);}
   
   public double value(){  
	      return f;
	      
	   }
	  
	   public boolean lessThan(Comparable c){  
	      if (this.f < c.value()) {
	         return true;
	      }
	      else {
	         return false;
	      }
	   }
	  
	   public boolean equal(Comparable c){  
	      if (this.f == c.value()) {
	         return true;
	      }
	      else {
	         return false;
	      }
	   }
	  
	   public boolean greaterThan(Comparable c){ 
	   if (this.f > c.value()) {
	         return true;
	      }
	      else {
	         return false;
	      }
	      
	   }

}
