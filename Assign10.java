import java.util.*;

   
 public class Assign10


{


     public static void main(String args[])


{
        
  Scanner scanner = new Scanner(System.in);


        System.out.println("**Convert Fahrenheit to Celsius**");

     
   System.out.print("Enter the Fahrenheit value = ");

    
    double f = scanner.nextDouble();

    
   
       double celsius = 5*(f-32)/9 ;


    
       System.out.println("\nCelsius is = " +celsius );
       
   
  
  }


}