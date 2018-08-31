package com.capgemini.domain;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class Question3 {
	@Test
	
	public void testorder()
	{
		ArrayList<String> array= new ArrayList<String>();
		array.add("anu");
		array.add("nikhi");
		array.add("ram");
		array.add("ani");
		
		
		assertEquals("ani",array.get(3));
	}

}
