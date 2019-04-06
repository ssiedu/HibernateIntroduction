package com.ssi;

import java.util.ArrayList;
import java.util.List;

public class ObjectArrayList {

	public static void main(String[] args) {

		Object ar1[]={111,"AAA"};
		Object ar2[]={112,"BBB"};
		Object ar3[]={113,"CCC"};
		
		List<Object[]> list=new ArrayList<Object[]>();
		list.add(ar1);
		list.add(ar2);
		list.add(ar3);
		
		
		for(Object ar[]:list){
			for(Object obj:ar){
				System.out.println(obj);
			}
			System.out.println("______________________");
		}

	}

}
