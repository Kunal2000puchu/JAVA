//*WAP in java for creating threads using the concept of extending the thread class.//
class MyThread1 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("I am Kunal Acharya");
            System.out.println("I am eating fish!");
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("I am Bhavika Sharma");
            System.out.println("I am eating egg");
        }
    }
}

public class Extends_threadClass {
    public static void main(String[] args) {
    MyThread1 t1 = new MyThread1();
    MyThread2 t2 = new MyThread2();
    t1.start();
    t2.start();

    }
}
