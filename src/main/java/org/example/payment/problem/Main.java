package org.example.payment.problem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CreditCard> creditCards = new ArrayList<>();
        for(CreditCard card : creditCards){
            if (card instanceof RuPay){
                card.upiPayment();
            }
        }
    }
}
