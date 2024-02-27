package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 2.9;
        int intValue = 0;

        // intValue = doubleValue; // 컴파일 오류 발생

        intValue = (int)doubleValue;    // 소수점 이하 버린다.
        System.out.println(intValue);   // 출력: 2

        // doubleValue 의 값은 바뀌지 않는다.
        System.out.println("doubleValue = " + doubleValue);

        // 명시적 형변환
    }
}
