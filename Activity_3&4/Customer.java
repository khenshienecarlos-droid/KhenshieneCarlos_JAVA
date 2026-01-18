public class Customer {
	
		String name;
		int points;
		static int totalCustomers = 1;
		
		public Customer(String name, int points){
		this.name= name;
		this.points = points;
		
	}
	public Customer(){
	name="Unknown";
	}
	public static void getAllowedRewardsRedemption(){
	System.out.println(CoffeeShop.customer_1.name + " can redeem  1 reward/s");
	System.out.println(CoffeeShop.customer_2.name + " can redeem  1 reward/s");
	System.out.println(CoffeeShop.customer_3.name + " can redeem  0 reward/s");
	System.out.println(CoffeeShop.customer_4.name + " can redeem  0 reward/s");
}
}