import java.io.*;

class Main {

   public static void main(String args[]) {
      char c = 0;
      short s = 1;
      int i = 2;
      float f = 0.0f;
      double df = 1.0;

      B b = new B( );
      D d = new D( );

      System.out.println("Direct calls");
      //d.foo(d, f); //error no match
      System.out.println("Error");
      //d.foo(c, d, df); //error no match
      System.out.println("Error");
      d.foo(df); // "B:foo(double)
      d.foo(i); // "B:foo(float)" derived
      //d.foo( ); // error, no match
      System.out.println("Error");
      //d.foo(i, d, df); // error, no match
      System.out.println("Error");
      d.foo(c, b, f); // "B:foo(int, B, float)" derived
      d.foo(f); // "B:foo(float)" derived
      d.foo(c); // "B:foo(float)" derived
      d.foo(s, d, df); // "B:foo(short, B, double)"
      //d.foo(i, d); //error, no match
      System.out.println("Error");

      System.out.println("b.caller");
      b.caller( );
      /*
       * b.caller
       * foo(d,f) = error, no match
       * foo(c, d, df)  = error, no match
       * foo(s) = "B:foo(short)"
       * foo(i) = "B:foo(double)"
       */

   }
}
