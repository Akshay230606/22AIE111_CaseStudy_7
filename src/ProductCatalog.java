import java.util.ArrayList;

public class ProductCatalog {

    private ArrayList<Product> products;

    public ProductCatalog() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public Product searchProductByID(int productID) {

        for (Product product : products) {

            if (product.getProductID() == productID) {
                return product;
            }
        }

        return null;
    }

    public void displayProducts() {

        for (Product product : products) {

            System.out.println("Product ID: " + product.getProductID());
            System.out.println("Product Name: " + product.getProductName());
            System.out.println("Price: " + product.getProductPrice());
            System.out.println("Stock: " + product.getProductStock());
            System.out.println("--------------------");
        }
    }
}