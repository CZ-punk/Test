package construct;

public class MemberConstruct {

    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    MemberConstruct(String name, int age) {
        this(name, age, 50);
        // 자기 자신의 생성자 호출 ( 생성자 내에서만 가능 )
        // 이게 위의 생성자를 호출하여 아래 와 같은 중복을 제거
        // 첫 번째 줄에만 작성 가능


//        this.name = name;
//        this.age = age;
//        this.grade = 50;
    }
}
