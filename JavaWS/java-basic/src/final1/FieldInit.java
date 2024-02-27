package final1;

public class FieldInit {
    static final int CONST_VALUE = 10;
    final int value = 10;

    // 초기값을 넣어버리면 생성자에서도 변경 불가

    /*
    public FieldInit(int value) {
        this.value = 19;
    }
    */

    // static final 붙은 필드는 대문자와 _ 로 쓰는 관례 존재
}
