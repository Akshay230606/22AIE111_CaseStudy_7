import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AuthenticationSystem auth = new AuthenticationSystem();
        ArrayList < Customer > customers = new ArrayList < > ();
        ArrayList < Seller > sellers = new ArrayList < > ();
        ArrayList < Order > orders = new ArrayList < > ();


        Seller seller1 = new Seller(1, "TMC Traders");
        sellers.add(seller1);

        Product rice = new Product(101, "Rice", 60, 100, seller1);
        Product wheatFlour = new Product(102, "Wheat Flour", 45, 80, seller1);
        Product sugar = new Product(103, "Sugar", 40, 70, seller1);
        Product salt = new Product(104, "Salt", 20, 50, seller1);
        Product milk = new Product(105, "Milk", 30, 60, seller1);
        Product bread = new Product(106, "Bread", 35, 40, seller1);
        Product eggs = new Product(107, "Eggs", 6, 200, seller1);
        Product cookingOil = new Product(108, "Cooking Oil", 140, 45, seller1);
        Product teaPowder = new Product(109, "Tea Powder", 120, 30, seller1);
        Product coffee = new Product(110, "Coffee", 180, 25, seller1);
        Product biscuits = new Product(111, "Biscuits", 25, 100, seller1);
        Product soap = new Product(112, "Soap", 35, 90, seller1);
        Product shampoo = new Product(113, "Shampoo", 120, 40, seller1);
        Product toothpaste = new Product(114, "Toothpaste", 90, 50, seller1);
        Product detergent = new Product(115, "Detergent", 160, 35, seller1);

        seller1.addProduct(rice);
        seller1.addProduct(wheatFlour);
        seller1.addProduct(sugar);
        seller1.addProduct(salt);
        seller1.addProduct(milk);
        seller1.addProduct(bread);
        seller1.addProduct(eggs);
        seller1.addProduct(cookingOil);
        seller1.addProduct(teaPowder);
        seller1.addProduct(coffee);
        seller1.addProduct(biscuits);
        seller1.addProduct(soap);
        seller1.addProduct(shampoo);
        seller1.addProduct(toothpaste);
        seller1.addProduct(detergent);

        ProductCatalog catalog = new ProductCatalog();

        catalog.addProduct(rice);
        catalog.addProduct(wheatFlour);
        catalog.addProduct(sugar);
        catalog.addProduct(salt);
        catalog.addProduct(milk);
        catalog.addProduct(bread);
        catalog.addProduct(eggs);
        catalog.addProduct(cookingOil);
        catalog.addProduct(teaPowder);
        catalog.addProduct(coffee);
        catalog.addProduct(biscuits);
        catalog.addProduct(soap);
        catalog.addProduct(shampoo);
        catalog.addProduct(toothpaste);
        catalog.addProduct(detergent);


        while (true) {

            System.out.println("\n===== ONLINE SHOPPING SYSTEM =====");
            System.out.println("1. Signup");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {

                case 1:
                    System.out.println("\n--- Customer Signup ---");
                    System.out.print("Enter Customer ID: ");

                    int customerID = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter Address: ");
                    String address = sc.nextLine();

                    System.out.print("Enter Username: ");
                    String username = sc.nextLine();

                    System.out.print("Enter Password: ");
                    String password = sc.nextLine();

                    Customer customer = new Customer(customerID, name, email, address, username, password);
                    customers.add(customer);
                    auth.signup(customer);
                    break;


                case 2:
                    System.out.println("\n--- Customer Login ---");
                    System.out.print("Enter Username: ");
                    String loginUsername = sc.nextLine();
                    System.out.print("Enter Password: ");
                    String loginPassword = sc.nextLine();
                    Customer loggedInCustomer = auth.login(loginUsername, loginPassword);
                    if (loggedInCustomer == null) {
                        System.out.println("Login Failed");
                        break;
                    }

                    while (true) {

                        System.out.println("\n===== CUSTOMER MENU =====");
                        System.out.println("1. View Products");
                        System.out.println("2. Add Product To Cart");
                        System.out.println("3. View Cart ");
                        System.out.println("4. Checkout");
                        System.out.println("5. Logout");
                        System.out.print("Enter Choice: ");

                        int customerChoice = sc.nextInt();
                        sc.nextLine();
                        switch (customerChoice) {

                            case 1:
                                catalog.displayProducts();
                                break;

                            case 2:
                                System.out.print("Enter Product ID: ");
                                int productID = sc.nextInt();
                                System.out.print("Enter Quantity: ");
                                int quantity = sc.nextInt();
                                sc.nextLine();
                                Product selectedProduct = catalog.searchProductByID(productID);
                                if (selectedProduct != null) {
                                    loggedInCustomer.getCart().addItem(selectedProduct, quantity);
                                    System.out.println("Product added to cart");
                                }

                                else {
                                    System.out.println("Product not found");
                                }
                                break;
                            case 3:
                                loggedInCustomer.getCart().displayCart();
                                break;
                            
                            case 4:

                                double cartTotal = loggedInCustomer.getCart().getTotalItemsPrice();
                                System.out.println("Cart Total: " + cartTotal);

                                Payment payment = new Payment(orders.size() + 1, cartTotal);
                                boolean paymentSuccess = payment.processPayment(cartTotal);

                                if (paymentSuccess) {

                                    Order order = new Order(orders.size() + 1, loggedInCustomer, loggedInCustomer.getCart().getCartItems());
                                    order.createOrder();
                                    orders.add(order);

                                    for (CartItem item: loggedInCustomer.getCart().getCartItems()) {
                                        item.getProduct().reduceStock(item.getQuantity());
                                    }

                                    System.out.println("Payment Successful");
                                    order.generateInvoice();
                                }

                                else {

                                    System.out.println("Payment Failed");
                                }
                                break;

                            case 5:
                                System.out.println("Logged Out");
                                break;

                            default:
                                System.out.println("Invalid Choice");
                        }

                        if (customerChoice == 5) {
                            break;
                        }
                    }

                    break;

                    
                case 3:
                    System.out.println("Exiting System...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }

    }
}