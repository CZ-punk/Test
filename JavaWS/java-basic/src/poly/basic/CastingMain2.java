package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child();
        // 단 자식의 기능은 호출할 수 없다, 컴파일 오류
        //poly.childMethod();

        // down casting (부모 타입 => 자식 타입 )
        Child child = (Child) poly;
        child.childMethod();

        // 일시적 down casting - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod();
        // 연산자 우선선위는 메서드 .메서드가 먼저 실행되서
        // ((child)poly) 를 괄호로 감싸고 .메서드를 진행

    }
}
