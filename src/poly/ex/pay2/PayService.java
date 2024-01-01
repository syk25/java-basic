package poly.ex.pay2;

import poly.ex.pay2.paymethod.PayMethod;

import static poly.ex.pay2.PayStore.findPay;

public class PayService {


    public void processPay(String option, int amount) {
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);
        PayMethod payMethod = findPay(option);
        boolean result = payMethod.pay(amount);
        checkTransaction(result);
    }


    private static void checkTransaction(boolean result){
        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
