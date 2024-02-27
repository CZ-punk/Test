package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역 변수
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
        //data1 = 20; // 컴파일 오류

        // final 지역 변수2
        final int data2 = 10;
        //data2 = 20;   // 컴파일 오류

        method(10);
        // 값이 한번 들어오면 끝.
    }

    static void method(final int parameter) {
        //parameter = 20; // 컴파일 오류
        // 매개변수에 final 붙어 있어 매개변수 값 변경 불가
    }
}
