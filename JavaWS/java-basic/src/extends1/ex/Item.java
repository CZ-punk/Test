package extends1.ex;

public class Item {

    // final 이 class 에 붙으면 상속을 안 해준다.
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // final 이 method 에 붙으면 override 할 수 없다.
    public void print() {
        System.out.println("이름: " + name + ", 가격: " + price);
    }

    public int getPrice() {
        return price;
    }
}
