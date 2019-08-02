package pack03;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hero", "root", "123456");
        String str = "select * from hero";
        String str2 = "insert into hero (name,type,price) values('123',123,123)";
        PreparedStatement p = c.prepareStatement(str2, Statement.RETURN_GENERATED_KEYS);
        //ResultSet rs= (ResultSet) p.executeQuery();
        p.executeUpdate();
        ResultSet r = (ResultSet) p.getGeneratedKeys();
        if (r.next()) {
            System.out.println("主键回写：" + r.getInt(1));

        }


    }


}
