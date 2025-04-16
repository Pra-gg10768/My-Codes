
import java.sql.*;

public class FlightManagementSystem
{
	public boolean deleteFlight(int flightId)throws SQLException, ClassNotFoundException {
		
		boolean isDeleted = false;
		PreparedStatement ps = null;
		Connection conn = DB.getConnection();
		
		String sql = "DELETE FROM flight WHERE flightId = ?";
		
		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, flightId);              
            int rowsAffected = pstmt.executeUpdate();
            isDeleted = rowsAffected > 0;
            
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
        return isDeleted;
	}
}