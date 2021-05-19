//*Write a program in java to showcase uses of super keyword.
class Human {
    public void eat() {
        System.out.println("I am eating...");
    }
}

class kunal extends Human {
    public void eat() {
        System.out.println("I am eating fish...");
    }

    public void talk() {
        System.out.println(" I am talking...");
    }

    public void work() {
        super.eat();
        talk();
    }
}

public class exp_superKey {
    public static void main(String args[]) {
        kunal d = new kunal();
        d.work();
    }
}
