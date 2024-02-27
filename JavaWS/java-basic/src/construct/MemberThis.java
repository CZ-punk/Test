package construct;

public class MemberThis {

    // this 생략 가능
    // 변수를 찾을 때 가까운 지역변수를 먼저 찾고
    // 없으면 그 다음으로 멤버 변수를 찾는다.

    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;
    }

    void initMember2(String nameField) {
        this.nameField = nameField;
    }
}
