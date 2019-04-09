package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class ProjectDemoInQBC {

	public static void main(String[] args) {

		Session session=Util.getSF().openSession();
		Criteria criteria=session.createCriteria(Product.class);
		
		ProjectionList pList=Projections.projectionList();
		
		Projection pr1=Projections.property("pcode");
		Projection pr2=Projections.property("pname");
		
		
		pList.add(pr1);
		pList.add(pr2);
		
		criteria.setProjection(pList);
		
		List<Object[]> info=criteria.list();
		
		for(Object ar[]:info){
			for(Object val:ar){
				System.out.println(val);
			}
			System.out.println("________________________________");
		}
		
		
		
	}

}
