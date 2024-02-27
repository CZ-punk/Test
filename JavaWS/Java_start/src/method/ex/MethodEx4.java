package method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while(true) {
            System.out.println("------------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("------------------------------------");

            System.out.print("선택: ");
            int select = scanner.nextInt();

            if (select == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            }

            switch(select) {
                case 1:
                    balance = deposit(balance);
                    break;
                case 2:
                    balance = withdraw(balance);
                    break;
                case 3:
                    checkBalance(balance);
                    break;
                default:
                    System.out.println("올바른 옵션을 선택하세요.");
            }
        }
    }
    public static int deposit(int balance) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입금액을 입력하세요: ");
        int amount = scanner.nextInt();
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("출금액을 입력하세요: ");
        int amount = scanner.nextInt();
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
            return balance;
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
            return balance;
        }

    }

    public static void checkBalance(int balance) {
        System.out.println("현재 잔액: " + balance + "원");
    }

}
