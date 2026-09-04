package org.example.product.isp;

public class Seller extends User implements CanAdd, CanRemove, CanModify{

    protected Seller(String name) {
        super(name);
    }

    @Override
    public void addProduct() {
        System.out.println(getName() + " added a product");
    }

    @Override
    public void modifyProduct() {
        System.out.println(getName() + " modified a product");
    }

    @Override
    public void removeProduct() {
        System.out.println(getName() + " removed their own product");
    }
}
