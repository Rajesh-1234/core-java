import java.util.*;


public class Assign17

{


   public static void main(String args[])

{
 
  Scanner scanner = new Scanner(System.in)

;
 System.out.println("\nEnter number to be reverse=");


   int num= scanner.nextInt();


 
  int   sum=0;

  
while(num !=0)

{


  int temp=num%10;

 
 sum=sum * 10 + temp;


  num/=10;


}

           System.out.println("\nreverse number="+sum);

}


}