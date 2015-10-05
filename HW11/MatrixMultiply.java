import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

class MatrixObject {                                         
    int n;
    int [][] matrix;
    
    MatrixObject() {
    	Scanner in = new Scanner(System.in);
        System.out.println("Input integer n, size of array");
        n = in.nextInt();
        fill(n);
    	
    }
    
    public void fill (int q) {
    	int i, x;
    	matrix = new int[q][q];
    	Random rn = new Random();
    	n = q;
    	
    	for (i = 0; i < n; i++) {
    		for (x = 0; x < n; x++) {
    			
    			matrix[i][x] = rn.nextInt(10);
    		}
    	}
    }
    

    public void print () {
    	System.out.println(Arrays.deepToString(matrix));
    }
    

/*
    void keepBusy( int howLong ) {
        long curr = System.currentTimeMillis();
        while ( System.currentTimeMillis() < curr + howLong );
    }
*/

}



/*
class RepeatedUpdates extends Thread  {
    DataObject dobj;
    int threadId;

     RepeatedUpdates( DataObject d ) {
        dobj = d;
        start();
    }
    synchronized public void run( ) {
        int i = 0;
        threadId = (int) Thread.currentThread().getId();
        
        while ( i < 20000 ) {                                  
            dobj.set1(threadId);                               
            dobj.keepBusy(10);
            dobj.set2(threadId);                              
            if ( i % 1000 == 0 ) dobj.test();                
            try { sleep( (int) (Math.random() * 2 ) ); }    
            catch( InterruptedException e ) {}
            i++;
        }
    }
}
*/





public class MatrixMultiply {  
    public static void main( String[] args ) {           
        
        
    	MatrixObject m = new MatrixObject();  
    	m.print();

    }
}    
