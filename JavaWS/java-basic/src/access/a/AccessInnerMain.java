package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public
        data.publicField = 1;
        data.publicMethod();

        // 같은 패키지 default 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        // private 호출 불가
        // data.privateField = 3;
        // data.privatedMethod();

        // 내부 호출
        // public method 인 innerAccess 는 클래스 내에 포함되어 있고
        // 자신의 내부에 있는 모든 메서드, 필드에 접근 가능
        data.innerAccess();
    }
}
