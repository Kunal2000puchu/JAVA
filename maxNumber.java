//*WAP to find maximum of 3 integer numbers taken as input from user at runtime.
import java.util .Scanner;
public class maxNumber {
    public static void main(String[] args) {
        int x, y, z;  
        Scanner sc = new Scanner(System.In);  
        System.out.println("Enter the first number:");  
        x = sc.nextInt();  
        System.out.println("Enter the second number:");  
        y = sc.nextInt();  
        System.out.println("Enter the third number:");  
        z = sc.nextInt();  
        if(x > y && x > z)
        {
            System.out.println("Largest number is:"+x);
        }
        else if(y > z)
        {
            System.out.println("Largest number is:"+y);
        }
        else
        {
            System.out.println("Largest number is:"+z);
        }
    }
}
