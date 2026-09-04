package org.example.product.isp;

public class Admin extends User implements CanApprove, CanRemove {

    protected Admin(String name) {
        super(name);
    }

    @Override
    public void approveProduct() {
        System.out.println(getName() + " approved a product");
    }

    @Override
    public void removeProduct() {
        System.out.println(getName() + " removed any product");
    }
}
