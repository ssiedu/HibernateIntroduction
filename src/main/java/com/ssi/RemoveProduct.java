package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RemoveProduct {

	public static void main(String[] args) {

		Configuration config=new Configuration().configure("myconfig.xml");
		Session session=config.buildSessionFactory().openSession();
		Product p=new Product();
		p.setPcode(114);
		Transaction tr=session.beginTransaction();
		session.delete(p);
		tr.commit();
		System.out.println("Product Removed Successfully");
		
		

	}

}
