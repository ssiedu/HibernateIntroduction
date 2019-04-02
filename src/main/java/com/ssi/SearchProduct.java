package com.ssi;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SearchProduct {

		public static void main(String[] args) {

			//QBI (Query By Id)
			//fetching row using its Id
			//will give you either null or a single object of entity class
			//for QBI a method called get is given in Session class.
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Product To Be Searched");
			int pcode=sc.nextInt();
			
			Session session=Util.getSF().openSession();
			Product product=session.get(Product.class, pcode);
			if(product!=null){
			System.out.println("Product Code  : "+product.getPcode());
			System.out.println("Product Name  : "+product.getPname());
			System.out.println("Product Price : "+product.getPrice());
			}else{
				System.out.println("Invalid Product Code");
			}
			
			session.close();
					
			
			

		}

	}

