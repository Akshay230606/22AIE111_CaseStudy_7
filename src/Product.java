
public class Product {
	private int productID;
	private String name;
	private double price;
	private int stock;
	private Seller seller;
	
	public Product(int _productId, String _name,double _price,int _stock,Seller _seller) {
		this.productID = _productId;
		this.name = _name;
		this.price = _price;
		this.stock = _stock;
		this.seller = _seller;
	}
	
	public int getProductID() {
		return productID;
	}
	
	public String getProductName() {
		return name;
	}
	
	public double getProductPrice() {
		return price;
	}
	
	public int getProductStock() {
		return stock;
	}
	
	public Seller getSeller() {
	    return seller;
	}
	
	public void reduceStock(int quantity) {
		if(quantity <= stock) {
			stock -= quantity;
		}
		
		else {
			System.out.println("Insufficient stock available");
		}
		
	}
	
	public void increaseStock(int quantity) {
		stock += quantity;
	}
}
