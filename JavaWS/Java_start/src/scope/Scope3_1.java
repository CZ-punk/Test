package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);

        // temp 는 if 문 내에서 잠깐 사용할 변수이다.
        // if 문 내에 선언하고 사용해야 메모리를 효율적으로 사용이 가능하다.
    }
}
