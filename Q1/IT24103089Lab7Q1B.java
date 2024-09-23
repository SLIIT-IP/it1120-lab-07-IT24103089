import java.util.Scanner ;
  public class IT24103089Lab7Q1B {
    public static void main (String[]args) {
     Scanner input = new Scanner (System.in);

     int student = 1;
     while ( student <= 3 ) {
     System.out.println ("Student " + student ) ;
     System.out.println ("Enter marks: ");

     String[] markArray = input.nextLine().split (" ") ;
     int mark1 = Integer.parseInt(markArray[0]) ;
     int mark2 = Integer.parseInt(markArray[1]) ;
     int mark3 = Integer.parseInt(markArray[2]) ;
     int mark4 = Integer.parseInt(markArray[3]) ;

     double average = ( mark1 + mark2 + mark3 + mark4 )/ 4.0 ;
     String grade ;
     
     if ( average <= 49 ) {
       grade = "Fail" ; }
     else if ( average <= 74 ) {
       grade = "Credit" ; }
     else {
       grade = "Distinction" ; }     

    System.out.println ("Average is: " + average);
    System.out.println ("Overall Grade is: " + grade);
    System.out.println (" ");

    student = student + 1 ;
     }

  }
}
     