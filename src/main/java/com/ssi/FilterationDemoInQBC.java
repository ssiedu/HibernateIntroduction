package com.ssi;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class FilterationDemoInQBC {
	public static void main(String[] args) {

		Session session=Util.getSF().openSession();	
		Criteria criteria=session.createCriteria(Product.class);
		
		//applying multiple conditions
		
		Criterion crt1=Restrictions.ge("price", 600);
		Criterion crt2=Restrictions.like("pname", "A%");

		Criterion crt3=Restrictions.and(crt1,crt2);
		
		//criteria.add(crt1);
		//criteria.add(crt2);
		
		criteria.add(crt3);
		
		
		
		
		//Criterion crt1=Restrictions.ge("price", 500);	//price>=500
		//Criterion crt1=Restrictions.eq("pname", "AA");
		//Criterion crt1=Restrictions.like("pname", "A%"); //where pname like 'A%'
		//Criterion crt1=Restrictions.between("price", 550, 800);
		//criteria.add(crt1);
		
		/*List<String> names=new ArrayList<String>();
		names.add("BBB");
		names.add("DDD");
		names.add("AA");*/
		//Criterion crt1=Restrictions.in("pname",names);
		//Criterion crt1=Restrictions.in("pname", "CCC","DDD","AA","BBB");
		//criteria.add(crt1);
		
		
		List<Product> products=criteria.list();
		for(Product product:products){
			System.out.println(product);
		}

		session.close();
	}
}
