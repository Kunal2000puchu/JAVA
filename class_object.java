//*WAP to create class with “name” as String and “age” as integer data members. 
//*The classshould have two methods to take input from user and display the data.

import java.util.Scanner;
class Student{  
    int age;  
    String name;
    public void takeInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        name = s.nextLine();
        System.out.println("Enter the age of the student: ");
        age = s.nextInt();
    } 
    public void display(){
        System.out.println("The name of the student is:"+name);
        System.out.println("The age of the student is:"+age);
    } 
}
public class class_object {
    public static void main(String args[]){  
        Student s = new Student();  
        s.takeInput();
        s.display(); 
       }   
}
