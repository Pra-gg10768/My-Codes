import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FruitBasketUtility fruitBasketUtility = new FruitBasketUtility();

        while (true) {
            System.out.println("Select an option:\n");
            System.out.println("1.Add Fruit to Basket");
            System.out.println("2.Calculate Bill");
            System.out.println("3.Exit");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
   
                    System.out.println("\nEnter the fruit name");
                    String fruitName = sc.nextLine();

                    System.out.println("\nEnter weight in Kgs");
                    int weightInKgs = sc.nextInt();

                    System.out.println("\nEnter price per Kg");
                    int pricePerKg = sc.nextInt();
                    sc.nextLine();

                    FruitBasket fb = new FruitBasket(fruitName, weightInKgs, pricePerKg);
                    fruitBasketUtility.addToBasket(fb);
                    break;

                case 2:
                    // Calculate Bill
                    List<FruitBasket> fruitList = fruitBasketUtility.getFruitBasketList();

                    if (fruitList.isEmpty()) {
                        System.out.println("\nYour basket is empty. Please add fruits.");
                    } else {
                        Stream<FruitBasket> fruitStream = fruitList.stream();
                        int totalBill = fruitBasketUtility.calculateBill(fruitStream);
                        System.out.println("\nThe estimated bill amount is Rs " + totalBill);
                    }
                    break;

                case 3:
                    System.out.println("\nThank you for using the application.");
                    sc.close();
                    return;

                default:
                    System.out.println("\nInvalid option. Please try again.");
            }
        }
    }
}
