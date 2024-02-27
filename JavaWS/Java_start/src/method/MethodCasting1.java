package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
        // printNumber(number): double 을 int 에 대입하는 것은 컴파일 오류
        printNumber((int)number);
    }
    public static void printNumber(int n) {
        System.out.println("숫자: " + n);
    }
}
