package exception;

public class throws2 {
    public static void main(String[] args) {
        try {
            method1();
            method2();
            method3();
        } catch (ClassNotFoundException | ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
        }


    }
    public static void method1() throws ClassNotFoundException {
            throw new ClassNotFoundException("Class error");
    }
    public static void method2() throws ArithmeticException {
            throw new ArithmeticException("Arithmetic error");
    }
    public static void method3() throws NullPointerException {
            throw new NullPointerException("Null error");
    }



}
