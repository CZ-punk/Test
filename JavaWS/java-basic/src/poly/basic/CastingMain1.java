package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child();
        // 단 자식의 기능은 호출할 수 없다, 컴파일 오류
        //poly.childMethod();

        // down casting (부모 타입 => 자식 타입 )

        // Child child = poly;
        // x001, 하지만 오류 (poly 는 Parent type 이라)

        // 하지만 강제로 변환하면 가능
        Child child = (Child) poly;
        child.childMethod();


    }
}
