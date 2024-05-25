package userpack;

import java.util.ArrayList;
import exceptionspack.*;

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

    public void return_fragrance(String name) throws OrderError {
        if (!order_history.contains(name)) {
            throw new OrderError("This name was not borrowed by the client.");
        }
        order_history.remove(name);
        System.out.println("Fragrance returned: " + name);
    }

    public void check_order_history() {
        System.out.println("Order History: " + order_history);
    }

    public void send_feedback(Producer producer, String feedback_message) throws FeedbackError {
        if (!order_history.contains(feedback_message)) {
            throw new FeedbackError("Feedback not valid for this fragrance.");
        }
        System.out.println("Sending feedback to " + producer.getFullName() + ": " + feedback_message);
    }

    public ArrayList<String> getOrder_history() {
        return order_history;
    }
}