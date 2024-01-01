package poly.ex.pay2.paymethod;

public class DefaultPay implements PayMethod {

    @Override
    public boolean pay(int amount) {
        return false;
    }
}
