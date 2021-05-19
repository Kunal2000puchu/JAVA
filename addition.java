//*WAP to find sum of two integers taken as input from user at runtime.
import java.util.Scanner;
public class addition {
    public static void main(String args[])
   {
      int x, y, z;

      System.out.println("Enter two integers to calculate their sum");
      Scanner a = new Scanner(System.In);
     
      x = a.nextInt();
      y = a.nextInt();
      z = x + y;
     
      System.out.println("Sum of the integers = " + z);
   }
}
