import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Products products = new Products();

        while (true) {
            System.out.println("1.Add\n2.Display\n3.Exit");
            System.out.println("Enter your choice");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter the product");
                    String product = sc.nextLine();
                    products.addProductToList(product);
                    break;

                case 2:
                    ArrayList<String> productList = (ArrayList<String>) products.getProductList();
                    if (productList.isEmpty()) {
                        System.out.println("The list is empty");
                    } else {
                        products.sortProductList();
                        for (String item : productList) {
                            System.out.println(item);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using the application");
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
		
	}
}
