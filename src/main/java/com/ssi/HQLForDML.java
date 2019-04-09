package com.ssi;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HQLForDML {

	public static void main(String[] args) {

		String hql="update Product set price=price+10";
		Session session=Util.getSF().openSession();
		Transaction tr=session.beginTransaction();
		Query query=session.createQuery(hql);
		int n=query.executeUpdate();
		tr.commit();
		System.out.println(n+" rows modiefed");
		session.close();

	}

}
