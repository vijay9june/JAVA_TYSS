package com.ustglobal.collection.sorting.set;

import java.util.Comparator;

public class SortByPincode implements Comparator<Bank>{

	@Override
	public int compare(Bank o1, Bank o2) {
		
		Integer i = o1.pincode;
		Integer ii = o2.pincode;
		
		return i.compareTo(ii);
	}

}
