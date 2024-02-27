package cond;

public class CondOp1 {
    public static void main(String[] args) {
        int age  = 18;
        String status;
        if(age >= 18){
            status = "성인";
        } else{
            status = "미성년자";
        }
        System.out.println("age = " + age + ", status = " + status);

        // 단순하게 참과 거짓에 따라 값이 달라지는 경우
        // 삼항 연산자를 사용.
    }
}
