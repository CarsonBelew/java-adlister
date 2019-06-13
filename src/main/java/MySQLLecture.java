
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.Driver;

public class MySQLLecture {

    public static void main(String[] args) {

        try {
            DriverManager.registerDriver(new Driver());
            Config config = new Config();
            Connection connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );

            Statement statement = connection.createStatement();

            String queryOne = "select email from users";
//            String query = "select emp_no, salary  from salaries join salaries limit 15";
            ResultSet rs = statement.executeQuery(queryOne);


            while(rs.next()){
                System.out.println("email = " + rs.getString("email"));
//                System.out.println("emp_no = " + rs.getInt("emp_no"));
//                System.out.println("salary = " + rs.getString("salary"));
                System.out.println("------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}