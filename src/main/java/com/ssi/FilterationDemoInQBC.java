package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class FilterationDemoInQBC {
	public static void main(String[] args) {

		Session session=Util.getSF().openSession();	
		Criteria criteria=session.createCriteria(Product.class);
		
		//Criterion crt1=Restrictions.ge("price", 500);
		//Criterion crt1=Restrictions.eq("pname", "AA");
		//Criterion crt1=Restrictions.like("pname", "A%");
		Criterion crt1=Restrictions.between("price", 550, 800);
		criteria.add(crt1);
		List<Product> products=criteria.list();
		for(Product product:products){
			System.out.println(product);
		}

		session.close();
	}
}
