import java.util.*;

public class UserInterface {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        CartonUtility cartonUtility = new CartonUtility();

        System.out.println("Enter the number of cartons");
        int numCartons = sc.nextInt();
        sc.nextLine();

        if (numCartons <= 0) {
            System.out.println("Invalid");
            return;
        }

        List<Carton> cartonList = new ArrayList<>();
        System.out.println("Enter carton details");

        for (int i = 0; i < numCartons; i++) {
            String[] details = sc.nextLine().split("/");

            if (details.length != 3) {
                System.out.println("Invalid input format");
                return;
            }

            try {
                int quantity = Integer.parseInt(details[1].trim());
                double productCost = Double.parseDouble(details[2].trim());

                if (quantity <= 0) {
                    System.out.println("Quantity number should be a valid number");
                    return;
                }

                cartonList.add(new Carton(details[0].trim(), quantity, productCost));

            } catch (NumberFormatException e) {
                System.out.println("Quantity number should be a valid number");
                return;
            }
        }

        cartonUtility.setCartonList(cartonList);
        Carton maxCarton = cartonUtility.findMax(cartonUtility.convertToStream());

        if (maxCarton != null) {
            System.out.println(maxCarton.getProductName() + " had the highest quantity with " + maxCarton.getQuantity() + " nos");
        }

    }
}
