package MysqlEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BatchEx {

	public static void insert(List<PersonEntity> personentities)throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/db1";
		Connection con=DriverManager.getConnection(url,"root","root");
	String query="Insert into emp6( id,name) values (?,?);";
	PreparedStatement ps=con.prepareStatement(query);
	for(PersonEntity personentities1:personentities ) {
		ps.setInt(1, personentities1.getId());
		ps.setString(2, personentities1.getName());
		ps.addBatch();
		
	}
	ps.executeBatch();
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		List<PersonEntity> l=new ArrayList<>();
	l.add(new PersonEntity(1, "sharly"));
	l.add(new PersonEntity(2, "shalu"));
	l.add(new PersonEntity(3, "saranya"));
	l.add(new PersonEntity(4, "savitha"));
	l.add(new PersonEntity(5, "geetha"));
	
	insert(l);
		System.out.println("inserted");

	}

}
