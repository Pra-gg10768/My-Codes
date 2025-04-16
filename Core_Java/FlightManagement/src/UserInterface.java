import java.sql.SQLException;
import java.util.Scanner;
public class UserInterface{
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
    	Scanner sc = new Scanner(System.in);
        FlightManagementSystem flightSystem = new FlightManagementSystem();

        System.out.println("Enter flight Id");
        int flightId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter source");
        String source = sc.nextLine();

        System.out.println("Enter destination");
        String destination = sc.nextLine();

        System.out.println("Enter noOfSeats");
        int noOfSeats = sc.nextInt();

        System.out.println("Enter the fare");
        double flightFare = sc.nextDouble();

        Flight flight = new Flight(flightId, source, destination, noOfSeats, flightFare);
        
        boolean result = flightSystem.addFlight(flight);
        
        if (result) {
            System.out.println("Flight details added successfully");
        } else {
            System.out.println("Flight details not added successfully");
        }

        sc.close();
    }
}