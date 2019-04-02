package com.ssi;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RemoveProduct {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product Code To Be Removed");
		int pcode=sc.nextInt();
		
		Product product=new Product(); 
		product.setPcode(pcode);
		
		Session session=Util.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.delete(product);
		tr.commit();
		
		session.close();
		
		System.out.println("Product Removed");
		
		

	}

}
