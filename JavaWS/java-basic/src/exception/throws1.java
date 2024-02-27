package exception;

public class throws1 {
    public static void main(String[] args) {
        method1();
        method2();
        method3();

    }
    public static void method1() {
        try {
            throw new ClassNotFoundException("Class error");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void method2() {
        try {
            throw new ArithmeticException("Arithmetic error");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void method3() {
        try {
            throw new NullPointerException("Null error");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }



}
