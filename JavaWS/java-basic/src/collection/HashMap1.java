package collection;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> hashMap = new HashMap<>();
        
        hashMap.put("baby", "아기");
        hashMap.put("apple", "사과");
        hashMap.put("banana", "바나나");

        while(true) {
            System.out.print("찾고 싶은 단어는? :");
            String eng = scanner.next();

            if (eng.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            String kor = hashMap.get(eng);
            if (kor == null) {
                System.out.println(eng + " 는 없는 단어 입니다.");
            } else {
                System.out.println(eng + " 는 " + kor + " 이란 영단어 입니다.");
            }
        }
        scanner.close();
    }
}
