package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;

        // this: 멤버 변수를 가져온다. 자기자신의 참조값이다.
        // this: 자기자신의 인스턴스이다. ex. x001
    }
}
