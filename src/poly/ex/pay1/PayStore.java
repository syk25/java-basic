package poly.ex.pay1;

import poly.ex.pay1.paymethod.*;

public abstract class PayStore {

    public static PayMethod findPay(String option){
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        }else if (option.equals("new")) {
            return new NewPay();
        } else {
            System.out.println("결제 수단이 없습니다.");
            return new DefaultPay();
        }
    }
}
