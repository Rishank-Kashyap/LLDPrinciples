package org.example.product.problem;

public class Admin implements User {

    private final String name;

    public Admin(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean canBuyProducts() {
        return false;
    }

    @Override
    public boolean canModifyProducts() {
        return false;
    }

    @Override
    public boolean canAddProducts() {
        return false;
    }

    @Override
    public boolean canApproveProducts() {
        return true;
    }

    @Override
    public boolean canRemoveProducts() {
        return true;
    }

    @Override
    public void buyProduct() {
    }

    @Override
    public void modifyProduct() {
    }

    @Override
    public void addProduct() {
    }

    @Override
    public void approveProduct() {
        System.out.println(name + " approved a product");
    }

    @Override
    public void removeProduct() {
        System.out.println(name + " removed any product");
    }
}
