package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요: ");
        String foodName = scanner.nextLine();

        System.out.print("음식 가격을 입력해주세요: ");
        int foodPrice = scanner.nextInt();

        System.out.print("음식 수량을 입력해주세요: ");
        int foodQuantity = scanner.nextInt();

        int totalPrice = foodQuantity * foodPrice;
        System.out.print( foodName + " " + foodQuantity + "개를 주문하셨습니다.");
        System.out.println(" 총 가격은 " + totalPrice + "원 입니다.");
    }
}
