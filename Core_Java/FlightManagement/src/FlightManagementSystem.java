import java.sql.*;

public class FlightManagementSystem
{
	public  boolean addFlight(Flight flightObj) throws ClassNotFoundException, SQLException {
		
		if (flightObj.getFlightFare() < 0 || flightObj.getFlightFare() > 999999.99) {
            return false;
		}
		boolean isAdded = false;
        Connection conn = DB.getConnection();

        String sql = "INSERT INTO flight (flightId, source, destination, noofseats, flightfare) VALUES (?, ?, ?, ?, ?)";
        

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, flightObj.getFlightId()); 
            pstmt.setString(2, flightObj.getSource());
            pstmt.setString(3, flightObj.getDestination());
            pstmt.setInt(4, flightObj.getNoOfSeats());
            pstmt.setDouble(5, flightObj.getFlightFare());
            int rowsAffected = pstmt.executeUpdate();
            isAdded = rowsAffected > 0;
            
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
        return isAdded;
		
	}

    
}
