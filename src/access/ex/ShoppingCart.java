package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int count;

    public ShoppingCart() {
    }

    public void addItem(Item item){
        if(checkCountValid()){
            items[count++] = item;
        } else {
            System.out.println("쇼핑카트가 가득 찼습니다.");
        }
    }

    private boolean checkCountValid(){
        return count < 10;
    }

    public void displayItems(){
        int total = 0;
        System.out.println("장바구니 상품 출력");

        for (int i = 0; i < count; i++) {
            System.out.printf("상품명: %s, 합계: %d\n", items[i].getName(), items[i].getPrice() * items[i].getQuantity());
            total += items[i].getPrice() * items[i].getQuantity();
        }
        System.out.println("전체 가격 합: " + total);
    }
}
