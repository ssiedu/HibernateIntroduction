package com.ssi;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;


public class SQLDemo {
	public static void main(String args[]) {

		//using sql statements to fetch the data
		
		String sql="select * from product where price<500";
		
		Session session=Util.getSF().openSession();
		SQLQuery query=session.createSQLQuery(sql);
		
		query.addEntity(Product.class);
		
		List<Product> products=query.list();
		
		for(Product product:products){
			System.out.println(product);
		}
		
		
		session.close();
	
	}
}
