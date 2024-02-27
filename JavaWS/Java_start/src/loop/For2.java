package loop;

public class For2 {
    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;

        for (int i = 1; i <= endNum; i++) {
            sum += i;
            System.out.println("i = " + i + ", sum = " + sum);
        }

        // 작업 목록 표시: control + e
        // ( enter 바로 입력 시 이전 작업 파일로 이동 )
    }
}
