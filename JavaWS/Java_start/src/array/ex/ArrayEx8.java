package array.ex;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생 수를 입력하세요: ");
        int studentCount = scanner.nextInt();

        int[][] scores = new int[studentCount][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요:");

            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + " 점수:");
                scores[i][j] = scanner.nextInt();
            }
        }



        for (int i = 0; i < scores.length; i++) {
            int sum = 0;

            for (int j = 0; j < subjects.length; j++) {
                sum += scores[i][j];

            }
            double average = (double) sum / subjects.length;
            System.out.println((i + 1) + "번 학생의 총 점: " + sum + ", 평균: " + average);
        }
    }
}
