package com.ssi;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddProducts {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product Code");
		int pcode=sc.nextInt();
		System.out.println("Enter Product Name");
		String pname=sc.next();
		System.out.println("Enter Product Price");
		int price=sc.nextInt();
		
		Product product=new Product(pcode,pname,price);
		Session session=Util.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(product);
		tr.commit();
		session.close();
		System.out.println("Record Added");
		

	}

}
