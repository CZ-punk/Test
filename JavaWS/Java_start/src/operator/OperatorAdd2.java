package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        b = ++a;    // a 의 값을 먼저 증가시키고, 그 결과를 b 에 대입
        System.out.println("a = " + a + ", b = " + b);

        a = 1;
        b = 0;

        b = a++;    // a 의 값을 b 에 대입한 후, a 의 값을 증가
        System.out.println("a = " + a + ", b = " + b);
    }
}