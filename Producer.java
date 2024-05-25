package User;
import java.util.ArrayList;
import java.util.List;

public class Producer extends User {
    private final ArrayList<Fragrance> fragrances;

    // Constructor
    public Producer(String email, String password, String fullName, String address, String phoneNumber) {
        super(email, password, fullName, address, phoneNumber);
        this.fragrances = new ArrayList<>();
    }

    // Methods to manage fragrances
    public void add_fragrance(String name) throws FragranceError {
        if (fragrances.contains(name)) {
            throw new FragranceError("Fragrance already exists: " + name);
        }
        fragrances.add(name);
        System.out.println("Fragrance added: " + name);
    }

    public void renew_stock(String name) throws FragranceError {
        if (!fragrances.contains(name)) {
            throw new FragranceError("Fragrance not found: " + name);
        }
        System.out.println("Stock renewed for name: " + name);
    }

    public void view_feedback(String name) throws FragranceError {
        if (!fragrances.contains(name)) {
            throw new FragranceError("fragrance not found: " + name);
        }
        System.out.println("Viewing feedback for name: " + name);
    }

    public ArrayList<String> getFragrances() {
        return fragrances;
    }
}
