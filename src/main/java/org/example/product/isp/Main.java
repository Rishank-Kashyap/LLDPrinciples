package org.example.product.isp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new Buyer("Riya"));
        users.add(new Seller("Anil"));
        users.add(new Admin("Kabir"));

        // A. one list of everyone: only identity is safe to call
        for (User user : users) {
            System.out.println("user: " + user.getName());
        }

        // ...anything more has to ask about capability first
        for (User user : users) {
            if (user instanceof CanBuy buyer) {
                buyer.buyProduct();
            }
            if (user instanceof CanApprove approver) {
                approver.approveProduct();
            }
        }

        // B. a list per capability: no check needed, the type guarantees it
        List<CanRemove> removers = new ArrayList<>();
        removers.add(new Seller("Anil"));
        removers.add(new Admin("Kabir"));

        for (CanRemove remover : removers) {
            remover.removeProduct();
        }
    }
}
