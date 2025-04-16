import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Name");
        String name = sc.nextLine();
        
        System.out.println("Enter Phone Number");
        long phone = sc.nextLong();   
        sc.nextLine(); 
        
        System.out.println("Enter Address");
        String address = sc.nextLine();

        CustomerDetails customer = new CustomerDetails(name, phone, address);
        
        System.out.println("Enter Bero Type");
        String beroType = sc.nextLine();

        Bero bero = null;

        if (beroType.equals("Steel Bero")) {
            System.out.println("Enter Bero Colour");
            String beroColour = sc.nextLine();
            System.out.println("Enter Bero Height");
            int beroHeight = sc.nextInt();
            bero = new SteelBero(beroType, beroColour, beroHeight);
        } else if (beroType.equals("Wooden Bero")) {
            System.out.println("Enter Bero Colour");
            String beroColour = sc.nextLine();
            System.out.println("Enter Wood Type");
            String woodType = sc.nextLine();
            bero = new WoodenBero(beroType, beroColour, woodType);
        } else {
            System.out.println(beroType + " is an invalid bero type");
            return;
        }

        bero.calculatePrice();
        double price = bero.getPrice();
        if (price <= 0) {
            System.out.println("Invalid input for bero details");
            return;
        }

        Discount discountCalculator = new Discount();
        double discount = discountCalculator.calculateDiscount(bero);
        double totalPrice = price - discount;

        System.out.printf("Amount needs to be paid %.2f", totalPrice);

	}

}
