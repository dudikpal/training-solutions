package zarovizsgapotvizsga2.housecup;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HouseCup {
    
    private MariaDbDataSource dataSource;
    
    public HouseCup(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }
    
    
    public int getPointsOfHouse(String house) {
        String query = "SELECT SUM(points_earned) FROM house_points WHERE house_name = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)){
            stmt.setString(1, house);
            return sumPoints(stmt);
        } catch (SQLException throwables) {
            throw new IllegalStateException("Cannot read db");
        }
    }
    
    
    private int sumPoints(PreparedStatement stmt) {
        try (ResultSet rs = stmt.executeQuery()){
            rs.next();
            return rs.getInt("SUM(points_earned)");
        } catch (SQLException throwables) {
            throw new IllegalStateException("Cannot read result");
        }
    }
}
