package JDBC_Example;
//1. Import the package
import java.sql.*;

public class JDBC_Example {
    public static void main(String[] args) throws Exception{
        
        // VARIABLES 
        //jdbc:mysql://localhost:port number/database name;
        String url = "jdbc:mysql://localhost:3306/smvec_gtec_batch";
        String uname = "root";
        String pass = "Naveen@007";
        // SELECT columnName from tableName WHERE condition;
        String query = "select stdName from studentdetails where stdID = 1";
        
        // 2. Register
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // 3. Establish the Connection
        Connection conn = DriverManager.getConnection(url, uname, pass);
        
        // 4. Create the Statement
        Statement st = conn.createStatement();
        
        // 5. Execute the query
        ResultSet rs = st.executeQuery(query);
        
        rs.next();
        String name = rs.getString("stdName");
        
        System.out.println(name);
        
        //7. CLOSE
        st.close();
        conn.close();
        
    }
}



    

