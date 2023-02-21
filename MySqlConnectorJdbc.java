import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
public class MySqlConnectorJdbc {
    public static void sqlcon(){
        try (Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","1234"))
         {
    Statement sm=con.createStatement();
    ResultSet rs= sm.executeQuery("select * from sys.host_summary");
    while(rs.next()){
    String id=String.valueOf(rs.getString("file_io_latency"));
    String name=rs.getString("host");
    System.out.println(id);
    System.out.println(name);
    }
    } catch ( SQLException e) {
     e.printStackTrace();
    }}
    public static void main(String[]args){
      sqlcon();
    }
}
