import java.util.Scanner;

public class UserInterface {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the customer details");
        
        String input = sc.nextLine();
        String[] details = input.split(":");

        String name = details[0];
        int adults = Integer.parseInt(details[1]);
        int children = Integer.parseInt(details[2]);
        int days = Integer.parseInt(details[3]);

        if (adults < 0) {
            System.out.println("Invalid input for number of adults");
        } else if (children < 0) {
            System.out.println("Invalid input for number of children");
        } else if (days <= 0) {
            System.out.println("Invalid input for number of days");
        } else {
            int totalCost = (adults * 1000 + children * 650) * days;
            System.out.println(name + " your booking is confirmed and the total cost is " + totalCost);
        }
        
        sc.close();
    }
}
