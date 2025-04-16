import java.sql.SQLException;
import java.util.*;
public class UserInterface{
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
    	Scanner sc = new Scanner(System.in);
        FlightManagementSystem fms = new FlightManagementSystem();

        System.out.println("Enter the flight Id");
        int flightId = sc.nextInt();

        boolean isUpdated = fms.deleteFlight(flightId);

        if (isUpdated) {
            System.out.println("Flight details deleted successfully");
        } else {
            System.out.println("Flight not deleted. Check for the ID");
        }
    }
}