package org.example.payment.problem;

public class Master extends CreditCard{
    @Override
    public void tapAndPayment() {
        System.out.println("Master, tap and payment");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Master, online payment");
    }

    @Override
    public void swipeAndPayment() {
        System.out.println("Master, swipe and payment");
    }

    @Override
    public void mandatoryPayment() {
        System.out.println("Master, mandatory payment");
    }

    @Override
    public void upiPayment() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void intlPayment() {
        System.out.println("Master, international payment");
    }
}
