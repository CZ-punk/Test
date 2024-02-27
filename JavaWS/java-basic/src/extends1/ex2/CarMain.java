package extends1.ex2;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();

        // 상속 구조도
        // 자식 -> 부모 가리킴
        // 등골 빤다는 것을로 생각
    }
}
