package exception;

import java.util.Scanner;

public class throw1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("음수를 제외한 숫자만 입력하세요: ");
            int num = scanner.nextInt();
            scanner.nextLine();
            if (num < 0) {
                throw new ArithmeticException("왜 하지말라는 것을 하시는 거죠?");
            }
            System.out.println("음수를 입력하지않으셨군요. 감사합니다.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            // getMessage() 는 예외 클래스의 인자값이 출력
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
