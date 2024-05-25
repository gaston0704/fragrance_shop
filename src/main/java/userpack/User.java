package userpack;
import exceptionspack.AuthenticationError;

public abstract class User {
    private String email;
    private String password;
    private String fullName;
    private String address;
    private String phoneNumber;

    // Constructor
    public User(String email, String password, String fullName, String address, String phoneNumber) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return email;
    }

    public void setUsername(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean register() {
        System.out.println("Registering user: " + this.email);
        //linking to the database needed here
        return true;
    }

    public boolean login(String email, String password) throws AuthenticationError {
        System.out.println("Attempting login for: " + email);
        if (this.email.equals(email) && this.password.equals(password)) {
            System.out.println("Login successful!");
            return true;
        }
        else {
            throw new AuthenticationError("Invalid email or password!");
        }
    }
}
