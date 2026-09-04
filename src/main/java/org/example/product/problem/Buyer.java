package org.example.product.problem;

public class Buyer implements User {

    private final String name;

    public Buyer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean canBuyProducts() {
        return true;
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
        return false;
    }

    @Override
    public boolean canRemoveProducts() {
        return false;
    }

    @Override
    public void buyProduct() {
        System.out.println(name + " bought a product");
    }

    @Override
    public void modifyProduct() {
    }

    @Override
    public void addProduct() {
    }

    @Override
    public void approveProduct() {
    }

    @Override
    public void removeProduct() {
    }
}
