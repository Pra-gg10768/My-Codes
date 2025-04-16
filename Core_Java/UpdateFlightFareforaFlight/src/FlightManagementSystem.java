import java.util.*;
import java.sql.*;

public class FlightManagementSystem
{
	public boolean updateFlightFare(int flightId,double flightFare) throws SQLException, ClassNotFoundException{
		
		PreparedStatement ps = null;
		Connection conn = DB.getConnection();
		boolean isUpdated = false;
		
		String sql = "UPDATE flight SET flightFare=? WHERE flightID=?";
		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setDouble(1, flightFare);
            pstmt.setInt(2, flightId);              
            int rowsAffected = pstmt.executeUpdate();
            isUpdated = rowsAffected > 0;
            
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
        return isUpdated;
		
	}
}