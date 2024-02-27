package array;

public class Array1Ref4 {
    public static void main(String[] args) {
        //int[] students =  { 90, 80, 70, 60, 50 };
        int[] students = new int[] { 90, 80, 70, 60, 50, 40, 30, 20, 10 };
        // 위 둘 다 가능.

        //students = {90, 80, 70, 60, 50};
        // 이 때는 new int[] 작성해야 함.

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
