package method;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println("1번 호출: " + add(1, 2));
        System.out.println("2번 호출: " + add(1.2, 1.5));
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    // int add() 없어도 자동 형변환 때문에 int -> double 가능
    
    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
