package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; // m 생존 시작

        if (true) {
            int x = 20; // x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        }   // x 생존 종료

        System.out.println("main m = " + m);
        System.out.println("Not main x");
    }   // m 생존 종료

    // 외부 블럭에서 선언된 변수(m) 도 내부 블럭(if) 에서도 사용 가능하다.
}
