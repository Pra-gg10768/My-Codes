import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        Country country = new Country();

        while (true) {
            System.out.println("1.Add");
            System.out.println("2.Search");
            System.out.println("3.Exit");
            System.out.print("Enter your choice\n");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter the country name");
                    String countryName = sc.nextLine();
                    System.out.println("Enter the capital name");
                    String capitalName = sc.nextLine();
                    country.add(countryName, capitalName);
                    break;
                case 2:
                	 if (country.getCountryMap().isEmpty()) {
                	        System.out.println("The map is empty");
                	    } else {
                	        System.out.println("Enter the country name");
                	        String searchCountry = sc.nextLine();
                	        System.out.println(country.search(searchCountry));
                	    }
                	    break;
                case 3:
                    System.out.println("Thank you for using the application");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }
		
	}
}
