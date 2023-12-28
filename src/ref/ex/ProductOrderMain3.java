package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        ProductOrder[] orders = inputOrders();
        printOrders(orders);

    }

    static ProductOrder[] inputOrders(){

        System.out.print("주문의 개수를 입력하세요: ");
        int numberOfOrders = sc.nextInt();
        ProductOrder[] orders = new ProductOrder[numberOfOrders];


        for (int i = 1; i <= numberOfOrders; i++) {
            sc.nextLine();
            System.out.println(i + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = sc.nextLine();
            System.out.print("가격: ");
            int price = sc.nextInt();
            System.out.print("수량: ");
            int quantity = sc.nextInt();

            orders[i-1] = createOrder(productName,price,quantity);
        }
        return orders;
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
