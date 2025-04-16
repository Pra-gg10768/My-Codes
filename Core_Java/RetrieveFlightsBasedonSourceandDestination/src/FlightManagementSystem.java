import java.sql.*;
import java.util.ArrayList;

public class FlightManagementSystem 
{
	public ArrayList<Flight> viewFlightsBySourceAndDestination(String source,String destination) throws ClassNotFoundException, SQLException{
		ArrayList<Flight> flightList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DB.getConnection();
            String query = "SELECT * FROM flight WHERE source = ? AND destination = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, source);
            pstmt.setString(2, destination);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                Flight flight = new Flight(
                    rs.getInt("flightId"),
                    rs.getString("source"),
                    rs.getString("destination"),
                    rs.getInt("noofseats"),
                    rs.getDouble("flightfare")
                );
                flightList.add(flight);               
            }
        } catch (SQLException e) {
            e.printStackTrace();
            rs.close();
        }
        return flightList;
	}
    
}