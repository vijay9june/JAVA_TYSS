package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestFunMap2 {

	public static void main(String[] args) {

		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(21);
		al.add(34);
		al.add(44);
		al.add(20);
		al.add(98);
		al.add(74);
		
		List<Integer> l = 
				al.stream().map(i -> i+2).collect(Collectors.toList()); //Function

		for (Integer integer : l) {
			System.out.println(integer);
		}


	}

}
