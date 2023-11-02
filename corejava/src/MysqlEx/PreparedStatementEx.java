package MysqlEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementEx {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver"); 

		//Statement stmt;
        String url="jdbc:mysql://localhost:3306/db1";
        Connection con=DriverManager.getConnection(url,"root","root");
        System.out.println(con);
        System.out.println("Database dbemp connection suceesfully establish");
        String u="insert into empl3( eid,ename,ecity,eage,esalary,department) values (?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(u);
        
        ps.setInt(1, 120);
        ps.setString(2, "ram");
        ps.setString(3, "banglore");
        ps.setInt(4, 30);
        ps.setInt(5, 30000);
        ps.setString(6, "hr");
       
        int i=ps.executeUpdate();
        System.out.println("record inserted" +i);
        con.close();

	}

}
