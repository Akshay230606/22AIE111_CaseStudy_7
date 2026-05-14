import java.util.ArrayList;

public class Admin {

    private int adminID;

    public Admin(int _adminID) {
        this.adminID = _adminID;
    }

    public int getAdminID() {
        return adminID;
    }

    public void manageUsers(ArrayList < Customer > customers,ArrayList < Seller > sellers) {

        System.out.println("Managing Users");
        System.out.println("Total Customers: " + customers.size());
        System.out.println("Total Sellers: " + sellers.size());
    }

    public void monitorOrders(ArrayList < Order > orders) {

        System.out.println("Monitoring Orders");

        for (Order order: orders) {

            System.out.println("Order ID: " + order.getOrderID());

            System.out.println("Status: " + order.getStatus());
        }
    }

    public void handleIssues( String issue) {

        System.out.println("Issue handled: " + issue);
    }
}