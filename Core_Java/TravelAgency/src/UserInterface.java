import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the city name");
        String city = sc.nextLine().toLowerCase();
        String[] cities = {"chennai", "coimbatore", "erode", "karur", "madurai", 
                           "hyderabad", "salem", "bangalore", "delhi", "agra"};

        boolean isAvailable = false;
        for (String c : cities) {
            if (c.equals(city)) {
                isAvailable = true;
                break;
            }
        }
        if (isAvailable) {
            System.out.println("Bus for " + city + " is available");
        } else {
            System.out.println("Bus for " + city + " is not available");
        }
    }
}
