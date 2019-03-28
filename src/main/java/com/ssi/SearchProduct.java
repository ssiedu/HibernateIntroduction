package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SearchProduct {

		public static void main(String[] args) {

			Configuration config=new Configuration().configure("myconfig.xml");
			Session session=config.buildSessionFactory().openSession();
			
			Product product=session.get(Product.class, 112);
			System.out.println(product.getPcode());
			System.out.println(product.getPname());
			System.out.println(product.getPrice());
			
			
			System.out.println("Product Removed Successfully");
			session.close();
			

		}

	}

