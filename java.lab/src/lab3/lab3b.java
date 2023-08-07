package lab3;

import java.sql.*;

public class lab3b {
    public static void main(String[] args) {
        try{
            String dbURL = "jdbc:mysql://localhost:3306/ajp";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbURL, username, password);

            Statement st = conn.createStatement();
            String sql = "INSERT INTO avengers (name, super_power, planet) VALUES ('groot', 'psychokinesis', 'planetX'), ('ironman', 'iron', 'earth'), ('antman', 'tiny', 'earth')";
            st.execute(sql);
        }catch (Exception e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
