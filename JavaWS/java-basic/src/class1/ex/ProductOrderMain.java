package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {


        ProductOrder dubu = new ProductOrder();
        dubu.productName = "두부";
        dubu.price = 2000;
        dubu.quantity = 2;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;

        ProductOrder cola = new ProductOrder();
        cola.productName = "콜라";
        cola.price = 1500;
        cola.quantity = 2;

        ProductOrder[] manager = new ProductOrder[] {dubu, kimchi, cola};
        int result = 0;

        for (ProductOrder product : manager) {
            System.out.println("상품명: " + product.productName + ", 가격: " + product.price + ", 수량: " + product.quantity);
            result += product.price * product.quantity;
        }

        System.out.println("총 결제 금액: " + result);
    }
}
