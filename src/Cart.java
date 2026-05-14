import java.util.ArrayList;

public class Cart {

    private int cartID;
    private double totalItemsPrice;
    private ArrayList < CartItem > items;

    public Cart(int _cartID) {
        this.cartID = _cartID;
        this.items = new ArrayList < > ();
        this.totalItemsPrice = 0;
    }

    public int getCartID() {
        return cartID;
    }

    public ArrayList < CartItem > getCartItems() {
        return items;
    }

    public double getTotalItemsPrice() {
        return totalItemsPrice;
    }

    public void addItem(Product product, int quantity) {

        for (CartItem item: items) {

            if (item.getProduct().getProductID() == product.getProductID()) {

                item.setQuantity(item.getQuantity() + quantity);
                calculateTotal();
                return;
            }
        }

        items.add(new CartItem(product, quantity));
        calculateTotal();
    }

    public void removeItem(int productID) {

        CartItem itemToRemove = null;

        for (CartItem item: items) {

            if (item.getProduct().getProductID() == productID) {

                itemToRemove = item;
                break;
            }
        }

        if (itemToRemove != null) {
            items.remove(itemToRemove);
        }

        calculateTotal();
    }

    public void calculateTotal() {

        totalItemsPrice = 0;

        for (CartItem item: items) {
            totalItemsPrice += item.getTotalPrice();
        }
    }
    
    public void displayCart() {

        if (items.isEmpty()) {

            System.out.println("Cart is empty");
            return;
        }

        System.out.println("\n========== CART ==========");

        for (CartItem item : items) {

            System.out.println("Product : " + item.getProduct().getProductName());
            System.out.println("Quantity : " + item.getQuantity());
            System.out.println("Price : " + item.getProduct().getProductPrice());
            System.out.println("Total : " + item.getTotalPrice());
            System.out.println("----------------------");
        }

        System.out.println("Cart Total : " + totalItemsPrice);
        System.out.println("==========================");
    }
}