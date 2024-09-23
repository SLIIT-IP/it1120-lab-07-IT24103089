import java.util.Scanner ;
  public class IT24103089Lab7Q1A {
    public static void main (String[]args) {
     System.out.println ("Enter marks for four subjects: ");
     Scanner input = new Scanner (System.in);
     System.out.println ("Enter Subject Mark 1: ");
     int mark1 = input.nextInt() ;
     System.out.println ("Enter Subject Mark 2: ");
     int mark2 = input.nextInt() ;
     System.out.println ("Enter Subject Mark 3: ");
     int mark3 = input.nextInt() ;
     System.out.println ("Enter Subject Mark 4: ");
     int mark4 = input.nextInt() ;
     float average = ( mark1 + mark2 + mark3 + mark4 )/ 4 ;
     String grade ;
     
     if ( average <= 49 ) {
       grade = "Fail" ; }
     else if ( average <= 74 ) {
       grade = "Credit" ; }
     else {
       grade = "Distinction" ; }
     

    System.out.println ("Average is: " + average);
    System.out.println ("Overall Grade is: " + grade);
  }
}
     