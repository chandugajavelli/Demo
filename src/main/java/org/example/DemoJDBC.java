package org.example;
import java.sql.*;

public class DemoJDBC
{
    public static void  main(String[] args) throws SQLException
    {
        String url = "jdbc:postgresql://localhost:5432/Practice";
        String user = "postgres";
        String password = "123456";
        String query = "select * from student;";
        Connection conn = DriverManager.getConnection(url,user,password);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);

        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
        }


        System.out.println("Connected to PostgreSQL database");
        conn.close();
    }
}
