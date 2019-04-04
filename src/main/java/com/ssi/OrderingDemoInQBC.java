package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

public class OrderingDemoInQBC {

	public static void main(String[] args) {
		Session session = Util.getSF().openSession();
		
		Criteria criteria = session.createCriteria(Product.class);
		
		//Order order1=Order.asc("pcode");
		Order order1=Order.desc("price");
		Order order2=Order.asc("pname");
		criteria.addOrder(order1);
		criteria.addOrder(order2);
		
		
		List<Product> products = criteria.list();

		for (Product product : products) {
			System.out.println(product);
			
		}

		session.close();

	}

}
