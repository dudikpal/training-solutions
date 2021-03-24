package zarovizsgapotvizsga1.peoplesql;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PeopleDao {
    
    private MariaDbDataSource dataSource;
    
    public PeopleDao(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }
    
    public String findIpByName(String firstName, String lastName) {
        String result = "Not find";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT ip_address FROM people WHERE first_name = ? AND last_name = ?")
             ){
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            return getIpByName(stmt);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
    
    private String getIpByName(PreparedStatement stmt) {
        try (ResultSet rs = stmt.executeQuery()){
            rs.next();
            return rs.getString("ip_address");
        } catch (SQLException se) {
            throw new IllegalStateException(se);
        }
    }
}
