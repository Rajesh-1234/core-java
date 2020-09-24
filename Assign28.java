import java.util.*;


 public class Assign28


{
  
   public static void main(String args[])


{

  
   System.out.print("How many students you want to enter = ");

  
   Scanner scanner = new Scanner(System.in);

   
   int size = scanner.nextInt();


  
    String array[] = new String[size];


  
   for(int i= 0 ; i <array.length ; i++ )

 
 {

     
     array[i] = scanner.nextLine();


}

  
   System.out.println("Elements in array are");

 
  for(String str : array)


{

     
    System.out.print(str + "  ");


}

 
}

 
}