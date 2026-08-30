package org.example.discount.ocp;

public class ClothingDiscountPolicy implements DiscountPolicy {
    @Override
    public double calculate(double price) {
        return price * 0.2;
    }
}
