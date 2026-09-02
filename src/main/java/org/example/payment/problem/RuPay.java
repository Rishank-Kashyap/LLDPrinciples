package org.example.payment.problem;

public class RuPay extends CreditCard{
    @Override
    public void tapAndPayment() {
        System.out.println("RuPay, tap and payment");
    }

    @Override
    public void onlinePayment() {
        System.out.println("RuPay, online payment");
    }

    @Override
    public void swipeAndPayment() {
        System.out.println("RuPay, swipe and payment");
    }

    @Override
    public void mandatoryPayment() {
        System.out.println("RuPay, mandatory payment");
    }

    @Override
    public void upiPayment() {
        System.out.println("RuPay, UPI payment");
    }

    @Override
    public void intlPayment() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
