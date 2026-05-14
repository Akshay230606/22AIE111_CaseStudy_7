import java.util.ArrayList;

public class Seller {
	private int sellerID;
	private String sellerName;
	private ArrayList<Product> products;
	
	public Seller(int _sellerID,String _sellerName) {
		this.sellerID = _sellerID;
		this.sellerName = _sellerName;
		products = new ArrayList<>();
	}
	
	public int getSellerID() {
		return sellerID;
	}
	
	public String getSellerName() {
		return sellerName;
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public ArrayList<Product> getProducts() {
	    return products;
	}
}
