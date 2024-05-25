package User;

import Exceptions.AdminActionError;
import Exceptions.FragranceError;

public class Administrator extends User {

    // Constructor
    public Administrator(String email, String password, String full_name, String phone_number) {
        super(email, password, full_name, phone_number);
    }

    // Methods
    public void accept_fragrance_request(Producer producer, String fragrance) throws AdminActionError, FragranceError {
        if (fragrance == null || fragrance.isEmpty()) {
            throw new AdminActionError("fragrance request is invalid.");
        }
        producer.add_fragrance(fragrance);
        System.out.println("Fragrance request accepted: " + fragrance + " by " + producer.getFullName());
    }

    public void deny_fragrance_request(Producer producer, String fragrance) throws AdminActionError {
        if (fragrance == null || fragrance.isEmpty()) {
            throw new AdminActionError("Fragrance request is invalid.");
        }
        System.out.println("Fragrance request denied: " + fragrance + " by " + producer.getFullName());
    }

    public void accept_producer_request(Producer producer) throws AdminActionError {
        if (producer == null) {
            throw new AdminActionError("Producer request is invalid.");
        }
        System.out.println("Producer request accepted: " + producer.getFullName());
    }

    public void deny_producer_request(Producer producer) throws AdminActionError {
        if (producer == null) {
            throw new AdminActionError("Producer request is invalid.");
        }
        System.out.println("Producer request denied: " + producer.getFullName());
    }

    public void accept_order(Customer client, String order) throws AdminActionError {
        if (order == null || order.isEmpty()) {
            throw new AdminActionError("Order request is invalid.");
        }
        client.getOrder_history().add(order);
        System.out.println("Order request accepted: " + order + " by " + client.getFullName());
    }

    public void deny_order(Customer client, String order) throws AdminActionError {
        if (order == null || order.isEmpty()) {
            throw new AdminActionError("Order request is invalid.");
        }
        System.out.println("Order request denied: " + order + " by " + client.getFullName());
    }
}
