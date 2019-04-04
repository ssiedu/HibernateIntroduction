package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class ShowAllProducts {

	public static void main(String[] args) {

		//concept of QBC (Query By Criteria)
		
		Session session=Util.getSF().openSession();	
		Criteria criteria=session.createCriteria(Product.class);
		List<Product> products=criteria.list();
		
		for(Product product:products){
			System.out.println(product.getPcode());
			System.out.println(product.getPname());
			System.out.println(product.getPrice());
			System.out.println("_________________________________");
		}

		session.close();
	}

}
