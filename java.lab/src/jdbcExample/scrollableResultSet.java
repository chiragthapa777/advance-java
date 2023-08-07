package jdbcExample;

import java.sql.*;

public class scrollableResultSet {
    public static void main(String[] args) {
        try{
            String dbURL = "jdbc:mysql://localhost:3306/ajp";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbURL, username, password);

            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * from avengers";
            System.out.println("Before : ");
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                System.out.println(rs.getInt("id") + "\t " + rs.getString("name") );
            }

            // updating
            rs.absolute(1); // first row
            String newName = rs.getString("name") + "Updated";
            rs.updateString("name", newName);
            rs.updateRow();

//            // set row to start inorder to print all
//            rs.absolute(0);

            rs = st.executeQuery(sql);

            System.out.println("After : ");

            while (rs.next()){
                System.out.println(rs.getInt("id") + "\t " + rs.getString("name") );
            }


            conn.close();

        }catch (SQLException e){
            System.out.println("SQL Error"+e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
