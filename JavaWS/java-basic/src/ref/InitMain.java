package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        int a;
        // System.out.println("a = " + a);
        System.out.println("value1 = " + data.value);
        System.out.println("value2 = " + data.value2);

        // 지역 변수는 초기화 안하면 사용 X
        // 멤버 변수는 default 값이 존재, 초기화 안해도 사용 O
    }
}
