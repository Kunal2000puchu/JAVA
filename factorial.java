//*WAP to find factorial of a number using class and object.
import java.util.Scanner;
class factorial{ 
    public static void main(String args[]){ 
        int i,f=1,num;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a number for find factorial: "); 
        num = sc.nextInt();
        for(i=1; i<=num; i++){
        f=f*i;
        }
        System.out.println("Factorial of the "+num+" is "+f); 
    }
}
