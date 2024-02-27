package extends1.super1;

public class SuperMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.call();

        // this 는 자기 자신 참조
        // super 는 부모 클래스 참조
    }
}
