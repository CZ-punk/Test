package method;

public class MethodCasting2 {
    public static void main(String[] args) {
        int number = 100;
        printNumber(number);

    }
        // printNumber(number): double 을 in
    public static void printNumber(double n) {
        System.out.println("숫자: " + n);
    }
}
