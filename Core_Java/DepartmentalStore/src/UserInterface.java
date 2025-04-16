import java.util.Scanner;

public class UserInterface {

		public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the customer name");
		String name = sc.nextLine();
		System.out.println("Enter the phone number");
		String phone = sc.nextLine();
		System.out.println("Enter the street name");
		String street = sc.nextLine();
		System.out.println("Enter the bill amount");
		double bill = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the distance");
		int distance = sc.nextInt();
		sc.nextLine();
		
		CustomerDetails cd = new CustomerDetails(name,phone,street,bill,distance);
		double bonus = cd.calculateBonusPoints();
		double deliveryCharges = cd.deliveryCharge();
		
		System.out.println("Customer Name: "+name);
		System.out.println("Phone Number: "+phone);
		System.out.println("Street name: "+street);
		System.out.println("Bonus points: "+bonus);
		System.out.println("Delivery charge: "+deliveryCharges);
	}
}
