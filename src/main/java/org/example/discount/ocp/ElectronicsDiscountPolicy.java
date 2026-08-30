package org.example.discount.ocp;

public class ElectronicsDiscountPolicy implements DiscountPolicy {
    @Override
    public double calculate(double price) {
        return price * 0.1;
    }
}
