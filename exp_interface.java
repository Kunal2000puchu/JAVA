//*WAP in java to illustrate the concept of interfaces.
interface Base {
    final int age = 21;

    void display();
}

public class exp_interface implements Base {
    public void display() {
        System.out.println("I AM KUNAL ACHARYA");
    }

    public static void main(String[] args) {
        exp_interface t = new exp_interface();
        t.display();
        System.out.println("My age is " + age);
    }
}
