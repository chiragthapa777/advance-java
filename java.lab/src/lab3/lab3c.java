package lab3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class lab3c {
    public static void main(String[] args) {
        try{
            String dbURL = "jdbc:mysql://localhost:3306/ajp";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbURL, username, password);

            Statement st = conn.createStatement();
            String sql = "SELECT * FROM avengers where planet = 'earth'";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String planet = rs.getString("planet");
                System.out.println(id + " " + name + " " + " " + planet);
            }
        }catch (Exception e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
