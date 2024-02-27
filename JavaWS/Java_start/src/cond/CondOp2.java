package cond;

public class CondOp2 {
    public static void main(String[] args) {
        int age  = 18;
        String status = (age >= 18) ? "성인" : "미성년자";

        // 삼항 연산자
        // 조건 ? (참일 때 대입할 값) : (거짓일 때 대입할 값)

        System.out.println("age = " + age + ", status = " + status);

    }
}
