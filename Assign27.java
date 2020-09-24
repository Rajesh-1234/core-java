import java.util.*;


  public class Assign27


{


  public  static void main(String args[])


 {

  
     Scanner scanner = new Scanner(System.in);

  
     System.out.print("Enter the size of array = ");

 
      int size = scanner.nextInt();

   
    int array[] = new int[size];

  
     for( int i = 0 ; i<array.length ; i++ )


  {


       array[i] = scanner.nextInt();


}

 
      int min = array[0];
    
   int max = array[0];


  
   for ( int i = 0 ; i<array.length ; i++)


{


      if(array[i]<min)


{

     
  min = array[i];


  }


  if(array[i] > max)

 
{
  
         max = array[i];

  
}



}


     System.out.println("\nmax number in array = "+max);

 
      System.out.println("\nmin number in array = "+min);


   }


   }