import java.util.*;

   
 public class Assign9


{


     public static void main(String args[])


{


        Scanner scanner = new Scanner(System.in);

 
    System.out.print("Enter number of days = ");

    
   int days = scanner.nextInt();

 
    double years  = days / 365 ;    
  

      days = days % 365 ;

  
  System.out.print("\nNumber of years = "+years); 



    int week = days / 7 ;


   week = days % 7 ;


   System.out.print("\nNumber of weeks = "+week); 

  
 int day = week ;


    System.out.print("\nNumber of days = "+day); 
  
 

   }



 }