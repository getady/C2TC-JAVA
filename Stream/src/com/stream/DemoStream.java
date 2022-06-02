package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {

	public static void main(String[] args)
	{
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(0);
		al.add(6);
		al.add(60);
		al.add(75);
		al.add(90);
		System.out.println(al);
		List<Integer> ll=al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(ll);
	}

}