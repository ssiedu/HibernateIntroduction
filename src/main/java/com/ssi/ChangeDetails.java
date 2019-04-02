package com.ssi;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ChangeDetails {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product Code");
		int pcode=sc.nextInt();
		System.out.println("Enter New Price");
		int newprice=sc.nextInt();
		
		Session session=Util.getSF().openSession();
		
		Product product=session.get(Product.class, pcode);	
		product.setPrice(newprice);		
		
		
		Transaction tr=session.beginTransaction();
		session.update(product);
		
				
		tr.commit();
		session.close();
		
		System.out.println("Product Modified");
		

	}
}
