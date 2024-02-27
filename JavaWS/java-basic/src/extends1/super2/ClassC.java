package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        super(10, 20);
        // 부모 클래스 생성자 호출하는 super 함수는 무조건 첫 줄 작성
        System.out.println("ClassC 생성자");
    }
}
