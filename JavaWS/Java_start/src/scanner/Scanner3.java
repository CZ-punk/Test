package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("두 정수 중 더 큰 값: " + num1);
        } else if (num2 > num1) {
            System.out.println("두 정수 중 더 큰 값: " + num2);
        } else {
            System.out.println("두 정수는 같습니다.");
        }
    }


}
