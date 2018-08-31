package com.capgemini.domain;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Test;

class Question6Test {

	@Test
	void test() {
		HashMap<String, List<String>> student = new HashMap<>();

		String[] fruits;
		
		fruits = new String[] { "Banana", "Apple" };
		List<String> newArray = new ArrayList<>(Arrays.asList(fruits));
		student.put("sudhu", newArray);
		
		fruits = new String[] { "Orange", "Apple" };
		newArray = new ArrayList<>(Arrays.asList(fruits));
		student.put("shri", newArray);

		
		System.out.println(student);

		System.out.println(student.get("shri"));
		
		assertEquals(Arrays.asList("Orange", "Apple"),student.get("shri"));
		
		

	}

}