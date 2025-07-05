package electricity.billing.system;

import java.sql.*;

public class database {
    String url = "jdbc:mysql://localhost:3307/Bill_System";
    String username = "root";
    String password = "";
    Connection connection;
    Statement statement;
    database() throws Exception {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url,username,password);
            statement = connection.createStatement();
    }
}
