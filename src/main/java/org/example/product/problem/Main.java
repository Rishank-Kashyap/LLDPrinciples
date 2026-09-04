package org.example.product.problem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new Buyer("Riya"));
        users.add(new Seller("Anil"));
        users.add(new Admin("Kabir"));

        for (User user : users) {
            if (user.canBuyProducts()) {
                user.buyProduct();
            }
            if (user.canAddProducts()) {
                user.addProduct();
            }
            if (user.canApproveProducts()) {
                user.approveProduct();
            }
            if (user.canRemoveProducts()) {
                user.removeProduct();
            }
        }

        // nothing stops this, and nothing happens
        new Buyer("Riya").approveProduct();
    }
}
