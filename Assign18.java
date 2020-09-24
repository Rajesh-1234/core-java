import java.util.*;


public class Assign18

{


   public static void main(String args[])

{

    Scanner scanner = new Scanner(System.in);


   int temp = 0;

  
 System.out.println("*Check Prime numbers*");


  System.out.print("\nEnter the number to be checked = ");

  
 int number = scanner.nextInt();


   for ( int i = 2 ; i<number/2 ; i++ )


 {

  
      if(number % i == 0)


  {

    
     System.out.println("\nNumber is Not Prime");
 
        
           temp = 1;
  
      
            break;


  }


  }
 

     if ( temp == 0 )

  
{


      System.out.println("\nNumber is Prime");
  
     

 }



}


  }