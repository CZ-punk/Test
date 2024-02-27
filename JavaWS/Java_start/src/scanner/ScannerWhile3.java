package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("합계를 알려주는 프로그램(0 입력 시 합계 종료)");
        int sum = 0;
        while (true) {
            System.out.print("덧셈 할 정수를 입력하세요: ");
            int num = scanner.nextInt();
            if (num == 0) {
                System.out.println("0을 입력하여 합계를 출력하고 프로그램을 종료합니다.");
                System.out.println("총 합계: " + sum);
                break;
            }
            sum += num;
        }
    }
}
