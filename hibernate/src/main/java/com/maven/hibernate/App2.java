package com.maven.hibernate;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session; //we are connecting java with mysql by using hibernate...
import org.hibernate.SessionFactory; //main method...
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App2 {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Employee e1 = new Employee();
		e1.setId(1);
        e1.setName("chai");

		t.commit();

		System.out.println("Record inserted");
		s.close();

//     Employee ed2 = new Employee();
//      ed2.setId(3);
//      s.delete(ed2);
//      System.out.println("Record deleted Successfully "+ed2.getId());
//      t.commit();
//      
//		
//
//     
//
//		Query query = s.createQuery("from Employee");
//		List<Student> arr = query.list();
//
//		for (int i = 0; i < arr.size(); i++) {
//			System.out.println("Id :" + arr.get(i).getId() + "\nName : " + arr.get(i).getName() );
//		}
//		sf.close();
//		
//		Employee s2 = new Employee();
//		s2.setId(1);
//		s2.setName("sharly");
//		s.update(s2);
//		t.commit();
//
//		System.out.println("update successful");
//		s.close();

	}



	}


