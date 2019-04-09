package com.ssi;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HQLForDMLParameterIndex {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount : ");
		int amt=sc.nextInt();
		System.out.println("Enter Product Code : ");
		int pc=sc.nextInt();
		
		String hql = "update Product set price=price+?0 where pcode=?1";
		Session session = Util.getSF().openSession();
		Transaction tr = session.beginTransaction();
		Query query = session.createQuery(hql);
		
		query.setParameter(0, amt);
		query.setParameter(1, pc);
		
		int n = query.executeUpdate();
		tr.commit();
		System.out.println(n + " rows modiefed");
		session.close();

	}
}
