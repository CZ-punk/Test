package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        // 향상된 for문, for-each문
        for ( int number : numbers) {
            System.out.println(number);
        }   // 배열의 처음부터 끝까지 number 에 대입하여 for문을 돌린다.

        // iter : for-each문 단축키

        // 억지로 쓸 수는 있겠는데 일반 for문 쓰는 것이 훨씬 좋다.

        /*for (int number : numbers) {
            // for-each문을 사용할 수 없는 경우, 증가하는 index 값 필요 시
            System.out.println("number" + i + "번의 결과는: " + numbers[i]);
        }*/

    }
}
