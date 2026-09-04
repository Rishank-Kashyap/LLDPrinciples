package org.example.product.problem;

public class Seller implements User {

    private final String name;

    public Seller(String name) {
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
        return true;
    }

    @Override
    public boolean canAddProducts() {
        return true;
    }

    @Override
    public boolean canApproveProducts() {
        return false;
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
        System.out.println(name + " modified a product");
    }

    @Override
    public void addProduct() {
        System.out.println(name + " added a product");
    }

    @Override
    public void approveProduct() {
    }

    @Override
    public void removeProduct() {
        System.out.println(name + " removed their own product");
    }
}
