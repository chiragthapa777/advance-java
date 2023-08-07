package lab3;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class lab3e {
    public static void main(String[] args) {
        try {
            String dbURL = "jdbc:mysql://localhost:3306/ajp";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "SELECT * from avengers";
            JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();
            rs.setUrl(dbURL);
            rs.setUsername(username);
            rs.setPassword(password);
            rs.setCommand(sql);
            rs.execute();
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t " + rs.getString("name"));
            }
            rs.close();

        } catch (SQLException e) {
            System.out.println("SQL Error" + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
