import java.util.*;

 
 public class Assign16


{


    public static void main(String...args)


{


    Scanner scanner = new Scanner(System.in);


     System.out.println("\n***Table***");

   
  System.out.print("Enter the number which you want to print the table = ");

  
  int number  = scanner.nextInt();

   
 for( int i = 1 ; i<=10  ;  i++ )


{


    System.out.println(number + " * " + i + " = " + number*i);


}


  }


}