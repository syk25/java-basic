package class1.ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        // 상품주문정보 재열
        String[] productNames = {"두부", "김치", "콜라"};
        int[] prices = {2000, 5000, 1500};
        int[] quantities = {2, 1, 2};

        // 주문배열
        ProductOrder[] orders = new ProductOrder[3];



        // 데이터 입력
        for (int i = 0; i < 3; i++) {
            orders[i] = createOrder(productNames[i],prices[i],quantities[i]);
        }

        // 출력
        printOrders(orders);
    }
    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }
    static void printOrders(ProductOrder[] orders){
        int total = 0;
        for (ProductOrder productOrder : orders) {
            total += productOrder.quantity * productOrder.price;
            System.out.printf("상품명: %s, 가격: %d원, 수량: %d\n", productOrder.productName,productOrder.price,productOrder.quantity);
        }
        System.out.println("총 결제 금액: " + total + "원");
    }
}
