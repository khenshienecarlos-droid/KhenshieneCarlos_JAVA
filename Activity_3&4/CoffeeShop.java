public class CoffeeShop{
    
public static Customer customer_1 = new Customer("Joseph" , 200);
public static Customer customer_2 = new Customer("Peter", 0 );
public static Customer customer_3 = new Customer();
public static Customer customer_4 = new Customer("Diane", 0 );
		public static void main(String[] args) {
		
		addPoints();
		redeemRewards();
		displayCustomerInfo();
		customer_4.points += 50;
		
		System.out.println("\nCustomer: " + customer_4.name + " bought a hot beverage"  + " Thus she has earned 50 points" );
		Customer.totalCustomers ++;
		System.out.println("\nCustomer: " + customer_4.name);
		System.out.println("Points: " + customer_4.points);
		
		System.out.println("------------------------------") ;
		System.out.println("Total Registered Customers: " + Customer.totalCustomers + "\n");
		Customer.getAllowedRewardsRedemption();
		}
		public static void addPoints(){
		    customer_2.points += 200;
		    System.out.println("\nCustomer: " + customer_2.name + " has bought pastries and beverages, thus the customer has earned 200 points." + "\nTotal points: " + customer_2.points);
		    Customer.totalCustomers ++;
			customer_2.points+= 20;
		    System.out.println("Customer: " + customer_2.name + " has bought water, thus the customer has earned 20 points." + "\nTotal points: " + customer_2.points);
			Customer.totalCustomers ++;
			System.out.println("-----------------------------------------------------") ;
		}
		
		public static void redeemRewards(){
		System.out.println("\nCustomer: " + customer_1.name + " has redeemed a free drink!!");
		customer_1.points -= 100;
		System.out.println("Remaining points: " +customer_1.points);
		System.out.println("\nCustomer: " + customer_2.name + " has redeemed a free drink!!");
		customer_2.points -=100;
		System.out.println("Remaining points: " +customer_2.points);
		System.out.println("\nCustomer: " + customer_3.name + " does not have enough points to redeem a free drink");
    }
     
     public static void displayCustomerInfo(){
         System.out.println("\n======  CUSTOMER INFORMATION  ======");
         System.out.println("Customer: " + customer_1.name);
         System.out.println("Points: " + customer_1.points);
         System.out.println("------------------------------") ;
         System.out.println("Customer: " + customer_2.name);
         System.out.println("Points: " + customer_2.points);
         System.out.println("------------------------------") ;
         System.out.println("Customer: " + customer_3.name);
         System.out.println("Points: " + customer_3.points);
         System.out.println("------------------------------") ;
System.out.println("Total Registered Customers: " + Customer.totalCustomers);


     }
}

