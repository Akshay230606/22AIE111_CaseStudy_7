public class CartItem {

    private Product product;
    private int quantity;

    public CartItem(Product _product, int _quantity) {
        this.product = _product;
        this.quantity = _quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return product.getProductPrice() * quantity;
    }
}