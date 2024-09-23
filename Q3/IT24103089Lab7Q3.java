import java.util.Scanner ;
  public class IT24103089Lab7Q3 {
    public static void main (String[]args) {
     Scanner input = new Scanner (System.in);
     
      for ( int i = 1 ; i <6 ; i ++ ) {
        System.out.println("Customer " + i );

        System.out.println("Enter total bill amount: ");
        double amount = input.nextDouble();

        System.out.println("Enter the mode of payment (C for cash, O for other): ");
        String mode = input.next();
        
        if ( mode.equals ("C") || mode.equals ("c")) {
          double discount = amount * 5/100 ;
          double finalAmount = amount - discount ;
          System.out.println("Discount is: " + discount );
          System.out.println("Amount to be paid: " + finalAmount );
       }
       else if ( mode.equals ("O") || mode.equals ("o") ) {
          System.out.println("No discount applicable");
          System.out.println("Amount to be paid: " + amount );
       } 
       else {
          System.out.println("Payment Mode is Not Valid");  
       }
      
          System.out.println();
    }
  }
}
