import java.util.*;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the products count");
        int count = sc.nextInt();
        sc.nextLine();

        if (count <= 0) {
            System.out.println("Invalid count");
            return;
        }

        List<Product> productList = new ArrayList<>();

        System.out.println("Enter Product details");
        for (int i = 0; i < count; i++) {
            String[] input = sc.nextLine().split(":");
            int productId = Integer.parseInt(input[0]);
            String productName = input[1];
            double price = Double.parseDouble(input[2]);

            productList.add(new Product(productId, productName, price));
        }

        System.out.println("1.Sort By Id\n2.Sort By Price");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();

        if (choice == 1) {
            Collections.sort(productList, new SortById());
            System.out.println("After Sorting By Id");
        } else if (choice == 2) {
            Collections.sort(productList, new SortByPrice());
            System.out.println("After Sorting By Price");
        } else {
            System.out.println("Invalid choice");
            return;
        }

        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
