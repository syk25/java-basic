package poly.ex.pay0;

import poly.ex.pay0.paymethod.KakaoPay;
import poly.ex.pay0.paymethod.NaverPay;
import poly.ex.pay0.paymethod.PayMethod;

public class PayService {
    PayMethod payMethod;

    public void processPay(String option, int amount) {
        boolean result;
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);
        if (option.equals("kakao")) {
            KakaoPay kakaoPay = new KakaoPay();
            result = kakaoPay.pay(amount);
        } else if (option.equals("naver")) {
            NaverPay naverPay = new NaverPay();
            result = naverPay.pay(amount);
        } else {
            System.out.println("결제 수단이 없습니다.");
            result = false;
        }


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
