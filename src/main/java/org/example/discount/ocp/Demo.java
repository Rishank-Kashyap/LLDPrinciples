package org.example.discount.ocp;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {

        // The wiring lives HERE, outside the calculator.
        Map<ProductType, DiscountPolicy> policies = new HashMap<>();
        policies.put(ProductType.ELECTRONICS, new ElectronicsDiscountPolicy());
        policies.put(ProductType.CLOTHING, new ClothingDiscountPolicy());

        DiscountCalculator calculator = new DiscountCalculator(policies);

        System.out.println(calculator.calculateDiscount(new Product(ProductType.ELECTRONICS, 1000)));
        System.out.println(calculator.calculateDiscount(new Product(ProductType.CLOTHING, 1000)));
    }
}
