package com.usa.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListTest {
	public static void main(String[] args) {
		
	
		List<String> name = new ArrayList<>();
		name.add("Setara");
		name.add("Ali");
		name.add("Suraia");
		name.add("Sumaia");
		name.add("Sumaia");
		name.add("Sumaia");
		//name=(List<String>)name.stream().distinct().collect(Collectors.toList());
		System.out.println(name);//print all value in one line.
		System.out.println(name.get(1));// searching value by index theory.
		System.out.println(name.size());// size method for get the total number.
		for(int i= 0; i<name.size(); i++) {
			System.out.println(name.get(i));
		}
		List<Integer> age = new ArrayList<>();
		age.add(20);
		age.add(20);
		age.add(25);
		age.add(21);
		age.add(null);
		age.add(null);
		
		age=(List<Integer>) age.stream().distinct().collect(Collectors.toList());
		System.out.println(age);
		
	}

}

