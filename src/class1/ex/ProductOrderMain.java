package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder tofu = new ProductOrder();
        tofu.productName = "두부";
        tofu.price = 2000;
        tofu.quantity = 2;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;

        ProductOrder cola = new ProductOrder();
        cola.productName = "콜라";
        cola.price = 1500;
        cola.quantity = 2;

        ProductOrder[] productOrders = {tofu,kimchi,cola};

        int total = 0;
        for (ProductOrder productOrder : productOrders) {
            total += productOrder.quantity * productOrder.price;
            System.out.printf("상품명: %s, 가격: %d원, 수량: %d\n", productOrder.productName,productOrder.price,productOrder.quantity);
        }
        System.out.println("총 결제 금액: " + total + "원");
    }
}
