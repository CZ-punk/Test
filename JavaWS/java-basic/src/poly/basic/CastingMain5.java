package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
        
    }

    // (비교할 인스턴스) instanceof (희망하는 인스턴스):
    // 비교할 인스턴스가 희망하는 인스턴스 인지 확인하는 것
    // 반환값: true, false

    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child) {
            System.out.println("Child Instance OK");
            Child child = (Child) parent;
            child.childMethod();
        } else {
            System.out.println("Not Child Instance");
        }
    }
}
