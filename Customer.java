package user;

import java.util.ArrayList;

public class Customer extends User {
    private ArrayList<String> order_history;
    // Constructor
    public Customer(String username, String password, String fullName, String address, String phoneNumber) {
        super(username, password, fullName, address, phoneNumber);
    }

    // Additional methods specific to Customer can be added here
    public void search_brand(String name) {
        System.out.println("Searching fragrances for: " + name);
    }

    public void buy_fragrance(String name) throws OrderError {
        if (name == null || name.isEmpty()) {
            throw new OrderError("Fragrance is out of stock.");
        }
        order_history.add(name);
        System.out.println("Fragrance purchased: " + name);
    }
}
