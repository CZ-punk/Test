package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "myName");
        member.print();
        member.changeData("myId2", "choi");
        member.print();
    }
}
