package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;   // int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L;  // long -> double
        System.out.println("doubleValue2 = " + doubleValue);

        // int -> long -> double 가능 ( 반대는 불가능 )
        // 작은 범위 -> 큰 범위    가능

        // 자동 형변환
    }
}
