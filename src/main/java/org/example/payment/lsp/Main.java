package org.example.payment.lsp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<UpiPayable> creditCards = new ArrayList<>();
        for(UpiPayable card : creditCards){
                card.upiPayment();
        }
    }
}
