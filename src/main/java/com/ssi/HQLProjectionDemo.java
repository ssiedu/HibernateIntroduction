package com.ssi;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HQLProjectionDemo {
	public static void main(String[] args) {

		Session session=Util.getSF().openSession();
		Query query=session.createQuery("select pcode,pname from Product");
		List<Object[]> products=query.list();
		
		for (Object ar[] : products) {
			for (Object obj : ar) {
				System.out.println(obj);
			}
			System.out.println("___________________________");
		}
		
		
		session.close();
	}

}
