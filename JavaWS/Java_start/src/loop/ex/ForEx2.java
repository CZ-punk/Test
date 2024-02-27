package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {

//        int num = 2;
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(num * i);
//        }

        // for 문 쓸 때 여러 변수들의 (초기식), (조건문), (증감식) 을 사용할 수 있다.
        for (int i = 1, num = 2; i <= 10; num +=2, i++ ) {
            System.out.println(num);
        }
        // 윗 줄이 더 깔끔한 코드.. 추천하지 않는다.
    }
}
