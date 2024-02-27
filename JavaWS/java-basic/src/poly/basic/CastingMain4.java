package poly.basic;

// downCasting 을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child)parent1;
        child1.childMethod();

        Parent parent2 = new Parent();
        Child child2 = (Child)parent2;
        child2.childMethod();
        // 다운 캐스팅을 잘못하면 심각한 런타임 오류를 발생시킬 수 있다.
        // ClassCastException

        /*

        parent2 는 Parent 로 생성되었다.
        즉, 메모리 상 Child 자체가 존재하지 않음
        그래서 parent2 는 Child 로 캐스팅 불가

         */

    }
}
