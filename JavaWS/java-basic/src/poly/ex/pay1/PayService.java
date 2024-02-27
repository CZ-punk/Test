package poly.ex.pay1;

public class PayService {
    public void processPay(String option, int amount) {
        boolean result = false;
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);
        Pay[] pay = new Pay[] {new KakaoPay(), new NaverPay()};

        for (Pay optionPay : pay) {
            if (optionPay.payName().equals(option)) {
                result = optionPay.pay(amount);
                break;
            }
        }
        if (result) {
            System.out.println("결제를 성공했습니다.");
        } else {
            System.out.println("결제 수단이 없습니다.");
            System.out.println("결제를 실패했습니다.");
        }
    }
}
