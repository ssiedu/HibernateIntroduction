package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ChangeDetails {
	public static void main(String[] args) {

		Configuration config=new Configuration().configure("myconfig.xml");
		Session session=config.buildSessionFactory().openSession();
		Product p=new Product();
		p.setPcode(113);
		p.setPname("XYZ");
		p.setPrice(750);
		Transaction tr=session.beginTransaction();
		session.update(p);
		tr.commit();
		System.out.println("Product Modified Successfully");
		session.close();
		

	}
}
