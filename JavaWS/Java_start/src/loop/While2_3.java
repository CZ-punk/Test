package loop;

public class While2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 3;

        while (i <= endNum) {
            sum += i;
            System.out.println(i + "번째 loop..  i = " + i + ", sum = " + sum);
            i++;
        }

    }
}
