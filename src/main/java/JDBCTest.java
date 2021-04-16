import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false",
                "root",
               "codeup"
        );
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("Show databases");
        rs.next();
        System.out.println(rs.getString(1));

    }
}


//public class Config {
//    public String getUrl() {return "jdbc:mysql//localhost/adlister_db?serverTimezone=UTC&useSSL=false";}
//    public String getUser() {return "root";}
//    public String getPassword() {return "codeup";}
//}