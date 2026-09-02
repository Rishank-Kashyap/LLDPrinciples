package org.example.payment.problem;

public class VisaCard extends CreditCard{
    @Override
    public void tapAndPayment() {
        System.out.println("Visa, tap and payment");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Visa, online payment");
    }

    @Override
    public void swipeAndPayment() {
        System.out.println("Visa, swipe and payment");
    }

    @Override
    public void mandatoryPayment() {
        System.out.println("Visa, mandatory payment");
    }

    @Override
    public void upiPayment() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void intlPayment() {
        System.out.println("Visa, international payment");
    }
}
