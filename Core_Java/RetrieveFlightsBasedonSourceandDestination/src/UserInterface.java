import java.sql.SQLException;
import java.util.*;
public class UserInterface{
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
    	Scanner sc = new Scanner(System.in);
        FlightManagementSystem fms = new FlightManagementSystem();

        System.out.println("Enter the source");
        String source = sc.nextLine();

        System.out.println("Enter the destination");
        String destination = sc.nextLine();

        ArrayList<Flight> flights = fms.viewFlightsBySourceAndDestination(source, destination);

        if (flights.isEmpty()) {
            System.out.println("No flights available for the given source and destination");
        } else {
            for (Flight flight : flights) {
                System.out.println("Flight ID : " + flight.getFlightId());
                System.out.println("Source : " + flight.getSource());
                System.out.println("Destination : " + flight.getDestination());
                System.out.println("No of seats : " + flight.getNoOfSeats());
                System.out.println("Flight Fare : " + flight.getFlightFare());
            }
        }

        sc.close();


    }
}