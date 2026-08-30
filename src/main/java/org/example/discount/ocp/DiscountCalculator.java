package org.example.discount.ocp;

import java.util.HashMap;
import java.util.Map;

enum ProductType{
    ELECTRONICS,
    CLOTHING;
}

class Product{
    ProductType productType;
    double price;

    Product(ProductType productType, double price){
        this.productType = productType;
        this.price = price;
    }

    double getPrice(){
        return price;
    }
    ProductType getType(){
        return productType;
    }
}

public class DiscountCalculator {

    private final Map<ProductType, DiscountPolicy> policies;

    public DiscountCalculator(Map<ProductType, DiscountPolicy> policies) {
        this.policies = new HashMap<>(policies);
    }

    public double calculateDiscount(Product product) {
        DiscountPolicy policy = policies.get(product.getType());
        if (policy == null) {
            return 0;
        }
        return policy.calculate(product.getPrice());
    }
}
