package com.java.collection.list;

import java.util.Comparator;

public class IdSorter implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpId() - o2.getEmpId();
	}

}
