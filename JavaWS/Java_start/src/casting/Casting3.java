package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647;  // int 최고값
        long maxIntOver = 2147483648L;  // int 최고값 + 1 (초과)
        int intValue = 0;

        intValue = (int) maxIntOver;
        System.out.println("intValue = " + intValue);

        // over flow 발생
        // int 의 범위를 넘어선 값을 long -> int 형변환 할 때 발생

        // 시계침 처럼 반복

    }
}
