package OrderManagementSystem;

public class Customer {
    private final String name;
    private final String email;


    public String getEmail() {
        return email;
    }

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
