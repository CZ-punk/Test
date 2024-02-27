package oop1;


public class ValueObjectMain {
    public static void main(String[] args) {
        ValueData data = new ValueData();

        data.add();
        data.add();
        data.add();

        System.out.println("최종 숫자 = " + data.value);
    }
}
