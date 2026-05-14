
public class Customer {
	private int customerID;
	private String customerName;
	private Cart cart;
	private String customerEmail;
	private String customerAddress;
	private String username;
	private String password;
	
	public Customer(int _customerID,String _customerName,String _customerEmail,String _customerAddress,String _username,String _password) {
		this.customerID = _customerID;
		this.customerName = _customerName;
		
		this.cart = new Cart(customerID);
		
		this.customerEmail = _customerEmail;
		this.customerAddress = _customerAddress;
		this.username = _username;
		this.password = _password;
	}
	
	public String getUsername() {
	    return username;
	}

	public String getPassword() {
	    return password;
	}
	
	public int getCustomerID() {
		return customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public Cart getCart() {
		return cart;
	}
	
	public String getCustomerEmail() {
		return customerEmail;
	}
	
	public String getCustomerAddress() {
		return customerAddress;
	}
}
