import java.util.*;

  
   public class Assign7


{


     public static void main(String args[])


{


    Scanner scanner = new Scanner(System.in);

 
   System.out.println("\n**Percentage**\n");

 
   System.out.print("\nEnter the marks of CPP = ");

    
double cpp = scanner.nextDouble();
 

    System.out.print("\n\nEnter the marks of DBT = ");

   
 double dbt = scanner.nextDouble(); 


  
  System.out.print("\n\nEnter the marks of AWP = ");

  
  double awp = scanner.nextDouble(); 


 
    System.out.print("\n\nEnter the marks of Mean = ");


    double mean = scanner.nextDouble(); 


    
      System.out.print("\n\nEnter the marks of OS = ");

    
  double os = scanner.nextDouble(); 


   
 double total = cpp + dbt + awp + mean + os ;



   System.out.println("\n\n Total marks are = "+total);



  double percentage = (total/300) *60 ;


 
 System.out.println("\nPercentage of marks are = " + percentage);

    


  
}


   }