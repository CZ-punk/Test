package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        //Child child1 = new Parent();
        // 자식 변수가 부모 인스턴스 참조 불가능

        //poly.childMethod();
        // poly 는 Parent type 이라 childMethod 인 자식 타입의 메서드를 호출 불가
        
        // 그치만 casting 을 이용해 Child 인스턴스도 접근 가능하다!!
        
        /*

        new Child() 에서 Parent 와 Child 인스턴스가 생성
        Parent poly = .. 코드는 생성된 두 인스턴스 중 Parent 만 참조

        부모 타입은 자식 타입을 담을 수 있다.
        반대로 자식 타입은 부모 타입을 담을 수 없다.

         */

    }
}
