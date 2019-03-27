package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddProducts {

	public static void main(String[] args) {

		Product p1=new Product();
		p1.setPcode(111); p1.setPname("AAA"); p1.setPrice(500);
		Product p2=new Product(112,"BBB",600);
		Product p3=new Product(113,"CCC",700);
		
		Configuration config=new Configuration().configure();
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		Transaction tr=session.beginTransaction();
		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		
		tr.commit();
		
		session.close();
		
		System.out.println("DATA STORED");
		
		
		

	}

}
