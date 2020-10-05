import java.util.*;

   public class  TestAge

{

     public static void main(String args[])

{
          Scanner scanner = new Scanner(System.in);

         System.out.print("\nEnter your gender = ");

         char gender = scanner.next().charAt(0);

          System.out.print("\nEnter your age = ");

         int age = scanner.nextInt();

      

        String result  = (gender == 'f') && (age >=18) ? "Eligible for marriage" : (gender=='m') && (age>=21) ?"Eligible for marriage":"not Eligible for marriage";

       System.out.println(result);


  }

 }