package org.example.product.isp;

public class Buyer extends User implements CanBuy{

    protected Buyer(String name) {
        super(name);
    }

    @Override
    public void buyProduct() {
        System.out.println(getName() + " bought a product");
    }
}
