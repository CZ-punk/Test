package cond;

public class If3 {
    public static void main(String[] args) {
        int age = 14;

        // 단점: 조건을 만족해도 나머지 if 를 검사한다.
        // else if 를 통해 효율적으로 코드 만들 수 있다.

        if(age <= 7){
            System.out.println("미취학");
        }
        if(age >= 8 && age <= 13){
            System.out.println("초등학생");
        }
        if(age >= 14 && age <= 16){
            System.out.println("중학생");
        }
        if(age >= 17 && age <= 19){
            System.out.println("고등학생");
        }
        if(age >= 20){
            System.out.println("성인");
        }
    }
}
