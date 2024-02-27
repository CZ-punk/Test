package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);

        // static 변수를 사용하려면 클래스에 직접 접근하여 사용

        // 추가
        // 인스턴스를 통한 접근
        // 권장하지 않는다. 코드를 볼 때 인스턴스 변수인가? 라는 의문이 생긴다.
        Data3 data4 = new Data3("D");
        System.out.println(Data3.count);

        // 클래스를 통한 접근
        System.out.println(Data3.count);
    }
}
