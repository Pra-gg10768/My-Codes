import java.sql.SQLException;
import java.util.Scanner;
public class UserInterface{
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
    	Scanner sc = new Scanner(System.in);
        FlightManagementSystem fms = new FlightManagementSystem();

        System.out.println("Enter flightId");
        int flightId = sc.nextInt();

        System.out.println("Enter flightFare");
        double flightFare = sc.nextDouble();

        boolean isUpdated = fms.updateFlightFare(flightId, flightFare);

        if (isUpdated) {
            System.out.println("Flight Fare updated successfully");
        } else {
            System.out.println("Flight fare not updated. Check for the ID");
        }

    }
}