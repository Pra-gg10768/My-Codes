import java.util.List;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Car carInventory = new Car();
        
        while (true) {
            System.out.println("\n1.Add car\n2.Search by name\n3.Search by count\n4.Total\n5.Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the car name");
                    String name = sc.nextLine();
                    System.out.println("Enter no of cars sold");
                    int num = sc.nextInt();
                    if (num > 0) {
                        carInventory.addCar(name, num);
                    }
                    break;

                case 2:
                    if (carInventory.isEmpty()) {
                        System.out.println("The map is empty");
                    } else {
                        System.out.println("Enter the car name");
                        String searchName = sc.nextLine();
                        int count = carInventory.carByName(searchName);
                        if (count == -1) {
                            System.out.println("Car not found");
                        } else {
                            System.out.println(count);
                        }
                    }
                    break;

                case 3:
                    if (carInventory.isEmpty()) {
                        System.out.println("The map is empty");
                    } else {
                        System.out.println("Enter the count");
                        int count = sc.nextInt();
                        List<String> cars = carInventory.carByCount(count);
                        if (cars == null) {
                            System.out.println("No cars found");
                        } else {
                            for (String car : cars) {
                                System.out.println(car);
                            }
                        }
                    }
                    break;

                case 4:
                    if (carInventory.isEmpty()) {
                        System.out.println("The map is empty");
                    } else {
                        System.out.println(carInventory.totalCarsSold());
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using the application");
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
	}
}