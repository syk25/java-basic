package poly.ex.pay2;

import java.util.Scanner;

public class PayMain2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PayService payService = new PayService();

        while (true) {
            System.out.print("결제수단을 입력하세요(exit 입력시 종료):");
            String payOption = sc.nextLine();
            if(payOption.equals("exit")){
                System.out.println("결제 시스템을 종료합니다.");
                return;
            }
            System.out.print("결제금액을 입력하세요:");
            int amount = sc.nextInt();
            sc.nextLine();
            payService.processPay(payOption,amount);
        }
    }
}
