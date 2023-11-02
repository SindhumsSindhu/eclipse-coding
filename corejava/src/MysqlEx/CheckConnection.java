package MysqlEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.Statement;



public class CheckConnection {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver"); 

		//Statement stmt;
        String url="jdbc:mysql://localhost:3306/db1";
        Connection con=DriverManager.getConnection(url,"root","root");
        System.out.println(con);
        System.out.println("Database dbemp connection suceesfully establish");
       
        //INSERT STATEMENT
        Statement stmt;
        stmt = (Statement) con.createStatement();
       /* String query1 = "insert into empl3 values(102,'rama','AP',26,8000,'HR manager')";
        stmt.execute(query1);
        System.out.println("record inserted sucessfully ");*/
        
        //UPDATE STATEMENT
        String query2 = "update empl3 set ename ='Rita' where eid=119";
        stmt.executeUpdate(query2);
       
        stmt.execute(query2);
        System.out.println("Records updated successfully");
        
        
        //CREATE TABLE
        String query4= "create table emp5(id int primary key,name varchar(10))";
        stmt.execute(query4);
        System.out.println("Table created successfully");
	}

}
