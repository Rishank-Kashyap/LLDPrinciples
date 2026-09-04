package org.example.product.problem;

public interface User {

    String getName();

    boolean canBuyProducts();

    boolean canModifyProducts();

    boolean canAddProducts();

    boolean canApproveProducts();

    boolean canRemoveProducts();

    void buyProduct();

    void modifyProduct();

    void addProduct();

    void approveProduct();

    void removeProduct();
}
