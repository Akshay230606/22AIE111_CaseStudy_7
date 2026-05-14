import java.util.HashMap;

public class AuthenticationSystem {

    private HashMap < String, Customer > users;

    public AuthenticationSystem() {

        users = new HashMap < > ();
    }

    public void signup(Customer customer) {

    	String username = customer.getUsername();

        if (users.containsKey(username)) {

            System.out.println("Username already exists");

            return;
        }

        users.put(username, customer);

        System.out.println("Signup Successful");
    }

    public Customer login(String username, String password) {

        if (users.containsKey(username)) {

            Customer customer = users.get(username);

            if (customer.getPassword().equals(password)) {

                System.out.println("Login Successful");

                return customer;
            }
        }

        System.out.println("Invalid Username or Password");

        return null;
    }
}