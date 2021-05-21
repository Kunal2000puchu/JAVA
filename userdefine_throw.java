//*WAP in java to create a user defined Exception and throw it explicitly
class MyException extends Exception {
    String s1;

    MyException(String s2) {
        s1 = s2;
    }

    @Override
    public String toString() {
        return ("Output String = " + s1);
    }
}

public class useedefine_throw {
    public static void main(String args[]) {
        try {
            throw new MyException("Kunal Acharya");
        } catch (MyException exp) {
            System.out.println(exp);
        }
    }
}
