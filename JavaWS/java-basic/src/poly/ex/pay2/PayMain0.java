package poly.ex.pay2;

import java.util.Scanner;

public class PayMain0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayService PayService = new PayService();

        while (true) {
            System.out.print("결제 수단을 입력하세요: ");
            String option = scanner.nextLine();

            if (option.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            System.out.print("결제 금액을 입력하세요: ");
            int pay = scanner.nextInt();
            scanner.nextLine();

            PayService.processPay(option, pay);
        }
    }
}
