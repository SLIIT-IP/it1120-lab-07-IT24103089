public class IT24103089Lab7Q2B {
    public static void main (String[]args) {
      for ( int i = 1 ; i <6 ; i ++ ) {
         System.out.print ( i + " - " );

         for ( int j = 0 ; j < i ; j ++ ) {
          System.out.print( "* " );
         }

         System.out.println (" ");
      }
    }
}