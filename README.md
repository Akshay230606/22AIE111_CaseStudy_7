# Online Shopping Cart System

## Team Members

| Roll No | Name | Role |
|---|---|---|
| AM.SC.U4AIE25037 | Akshay Kumar P A | Main Module, Authentication, Catalogue |
| AM.SC.U4AIE25035 | Akhil S | Cart, CartItem, Customer |
| AM.SC.U4AIE25051 | Faham Muhammed Razi | Order, Payment, Product |
| AM.SC.U4AIE25048 | C. Manoj Kumar | Admin, Seller |

---

## Problem Description

The **Online Shopping Cart System** is a console-based Java application that simulates a real-world e-commerce platform. It allows customers to register, log in, browse products, add items to their cart, and complete purchases with invoice generation. The system also supports admin and seller roles for product and order management.

---

## How to Run the Code

### Prerequisites
- Java Development Kit (JDK) 8 or higher installed
- A terminal or command prompt

### Steps

1. Clone or download the repository.
2. Navigate to the `/src` directory:
   ```bash
   cd src
   ```
3. Compile all Java files:
   ```bash
   javac *.java
   ```
4. Run the main class:
   ```bash
   java Main
   ```

---

## Sample Input / Output

```
===== ONLINE SHOPPING SYSTEM =====
1. Signup
2. Login
3. Exit
Enter Choice: 1

--- Customer Signup ---
Enter Customer ID: 123
Enter Name: faham
Enter Email: faham@abc
Enter Address: home
Enter Username: faham_razi
Enter Password: 123456
Signup Successful

===== ONLINE SHOPPING SYSTEM =====
1. Signup
2. Login
3. Exit
Enter Choice: 2

--- Customer Login ---
Enter Username: faham_razi
Enter Password: 123456
Login Successful

===== CUSTOMER MENU =====
1. View Products
2. Add Product To Cart
3. View Cart
4. Checkout
5. Logout
Enter Choice: 1

Product ID: 101  |  Product Name: Rice       |  Price: 60.0   |  Stock: 100
Product ID: 102  |  Product Name: Wheat Flour|  Price: 45.0   |  Stock: 80
Product ID: 103  |  Product Name: Sugar      |  Price: 40.0   |  Stock: 70
... (15 products total)

Enter Choice: 2
Enter Product ID: 101
Enter Quantity: 2
Product added to cart

Enter Choice: 3

========== CART ==========
Product : Rice      | Qty: 2 | Price: 60.0 | Total: 120.0
Product : Milk      | Qty: 5 | Price: 30.0 | Total: 150.0
Product : Soap      | Qty: 4 | Price: 35.0 | Total: 140.0
Cart Total : 410.0
==========================

Enter Choice: 4
Order Created Successfully
Order ID: 1  |  Customer: faham  |  Total: 410.0  |  Status: Confirmed
Payment Successful

====================================
              INVOICE
====================================
Order ID    : 1
Customer    : faham
Date        : 2026-05-14
------------------------------------
Rice x 2 = 120.0
Milk x 5 = 150.0
Soap x 4 = 140.0
------------------------------------
Total Amount : 410.0
Status       : Confirmed
====================================

===== CUSTOMER MENU =====
1. View Products
2. Add Product To Cart
3. View Cart 
4. Checkout
5. Logout
Enter Choice: 5
Logged Out

===== ONLINE SHOPPING SYSTEM =====
1. Signup
2. Login
3. Exit
Enter Choice: 3
Exiting System...

```

---

## File Distribution Among Team Members

| Roll No | Name | Files Assigned |
|---|---|---|
| AM.SC.U4AIE25037 | Akshay Kumar P A | `Main.java`, `AuthenticationSystem.java`, `ProductCatalog.java` |
| AM.SC.U4AIE25035 | Akhil S | `Cart.java`, `CartItem.java`, `Customer.java` |
| AM.SC.U4AIE25051 | Faham Muhammed Razi | `Order.java`, `Payment.java`, `Product.java` |
| AM.SC.U4AIE25048 | C. Manoj Kumar | `Admin.java`, `Seller.java` |

> **Note:** 3 members handle 3 files each; C. Manoj Kumar handles 2 files, as the total is 11 files.

---

## Tools / Technologies Used

| Tool / Technology | Purpose |
|---|---|
| Java (JDK 8+) | Core programming language |
| OOP (Object-Oriented Programming) | System design and modularity |
| Collections Framework (ArrayList, HashMap) | Data storage and management |
| Scanner (java.util) | Console-based user input |
| IntelliJ IDEA / VS Code | IDE for development |
| Git & GitHub | Version control and collaboration |
