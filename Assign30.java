import java.util.*;


 public class Assign30


{
   
  public static void main(String args[])


{

  
   int array[][] =  new int [3][];

  
  int a [] = {9,8,7};

  
  int b [] = {6,5,4};

  
  int c[] = {3,2,1};


  
  array[0] = a;

  
  array[1] = b;

  
  array[2] = c;

 
 int sum = 0;

    
  
   for(int i = 0 ; i<array.length ; i++)

 
 {

   
   for(int j = 0 ; j<array[i].length ; j++)


{

    
    System.out.print(array[i][j] + "  ");


}
    
    System.out.println(" ");

 
 }

  
   for(int i = 0 ; i<array.length ; i++)

 
 {

   
   for(int j = 0 ; j<array[i].length ; j++)


{

 
  if(array[i] == array[j])

 
 {

       
    sum = sum + array[i][j];

 
}
    
  

}


}  

     
               System.out.println(sum);

 
}

 
 }