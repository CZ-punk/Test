package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // true 까지 작성하고 control shift enter 자동완성
        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = input.nextLine(); // line 을 읽음 ( \n 포함 )

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = input.nextInt();  // 숫자만 읽음 ( \n 미포함 )
            input.nextLine();   // 이걸 통해 \n 을 읽고 버린다.

            // 첫 째 싸이클 돌 때 nextInt() 의 \n 이 남아있고
            // 둘 째 싸이클 때 nextLine() 에서 남아있던 \n 을 읽어 버린다.

            System.out.println("입력한 이름: " + name + ", 나이: " + age);

        }
    }
}
