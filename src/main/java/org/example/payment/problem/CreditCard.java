package org.example.payment.problem;

public abstract class CreditCard {
    private String ccNumber;
    private String cvv;
    private String cardholderName;

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public String getCcNumber() {
        return ccNumber;
    }
    public String getCvv() {
        return cvv;
    }
    public String getCardholderName() {
        return cardholderName;
    }

    public abstract void tapAndPayment();
    public abstract void onlinePayment();
    public abstract void swipeAndPayment();
    public abstract void mandatoryPayment();
    public abstract void upiPayment();
    public abstract void intlPayment();

    public void displayCreditCardDetails() {
        System.out.println("CC Number: " + ccNumber + ", Owner: " + cardholderName);
    }
}
