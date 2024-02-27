package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s);
        
        // static 으로 method 를 정의하면 인스턴스를 생성하지 않고
        // 클래스 명을 통해 method 호출 가능

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
