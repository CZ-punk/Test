package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("입력한 정수 " + num + "은 짝수 입니다.");
        } else {
            System.out.println("입력한 정수 " + num + "은 홀수 입니다.");
        }


    }
}
