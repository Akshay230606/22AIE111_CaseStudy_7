import java.util.ArrayList;
import java.time.LocalDate;

public class Order {

    private int orderID;
    private LocalDate orderDate;
    private String status;

    private Customer customer;
    private ArrayList < CartItem > orderedItems;

    private double totalAmount;

    public Order(int _orderID, Customer _customer, ArrayList < CartItem > _orderedItems) {

        this.orderID = _orderID;
        this.customer = _customer;

        this.orderedItems = new ArrayList < > ();

        for (CartItem item: _orderedItems) {
            this.orderedItems.add(item);
        }

        this.orderDate = LocalDate.now();

        this.status = "Confirmed";

        totalAmount = 0;

        for (CartItem item: orderedItems) {
            totalAmount += item.getTotalPrice();
        }
    }

    public int getOrderID() {
        return orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getStatus() {
        return status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList < CartItem > getOrderedItems() {
        return orderedItems;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void updateStatus(String newStatus) {
        status = newStatus;
    }

    public void createOrder() {

        System.out.println("Order Created Successfully");
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer: " + customer.getCustomerName());
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Status: " + status);
    }

    public void generateInvoice() {

        System.out.println("\n====================================");
        System.out.println("              INVOICE");
        System.out.println("====================================");
        System.out.println("Order ID    : " + orderID);
        System.out.println("Customer    : " + customer.getCustomerName());
        System.out.println("Date        : " + orderDate);
        System.out.println("------------------------------------");
        System.out.println("Items Purchased");
        System.out.println("------------------------------------");

        for (CartItem item: orderedItems) {
            String productName = item.getProduct().getProductName();

            int quantity = item.getQuantity();
            double itemTotal = item.getTotalPrice();

            System.out.println(productName + " x " + quantity + " = " + itemTotal);
        }

        System.out.println("------------------------------------");
        System.out.println("Total Amount : " + totalAmount);
        System.out.println("Status       : " + status);
        System.out.println("====================================");
    }
}