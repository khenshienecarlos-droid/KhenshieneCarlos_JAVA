About the Program

This program is a simple online order management system made in Java. It simulates how an online store handles different types of orders, payments, and order statuses. 
The main goal of this activity is to practice abstraction, encapsulation, enums, and using collections safely.
Orders are created and processed while keeping data private and safe. 
The program also shows how to organize classes using packages and how to traverse collections without directly exposing them.

What the Program Does

-Uses abstract classes and interfaces to define order and payment behaviors
-Implements encapsulation to keep order data safe
-Uses an enum for order status (PENDING, PAID, SHIPPED, CANCELLED)
-Creates multiple orders and stores them in an ArrayList
-Traverses orders with an Iterator, displaying summaries and removing cancelled orders
-Organizes classes into packages: com.store.order, com.store.payment, com.store.main

Classes and Packages

com.store.order – abstract Order class, OrderStatus enum
com.store.payment – Payable interface for payment behavior
com.store.main – OrderApp with main method to create and manage orders
OnlineOrder – concrete class extending Order and implementing Payable

Concepts Used

Abstraction, encapsulation, interfaces, enums, packages, ArrayList, Iterator, and basic OOP principles.
