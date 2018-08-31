package com.capgemini.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class Collectiontest2 {
	@Test
	void testLaptopProducts() {
		HashSet<Laptop1> laptops = new HashSet<Laptop1>();
		assertEquals(true,laptops.add(new Laptop1("ell", "Ion5558", "Wndows 8", "5")));
		 assertEquals(true,laptops.add(new Laptop1("Dell", "Inspiron5558", "Windows 8", "i5")));
		 assertEquals(true,laptops.add(new Laptop1("HP", "HP234", "Windows 9", "i5")));
		 assertEquals(false,laptops.add(new Laptop1("HP", "HP234", "Windows 9", "i6")));
		assertEquals(3, laptops.size());
		for (Laptop1 laptop1 : laptops) {
			System.out.println(laptop1);
			
		}
	}
		@Test
		void testSchoolProducts() {
			HashSet<School1> Schools = new HashSet<School1>();
			assertEquals(true,Schools.add(new School1("onida", "o2", 220,4)));
			assertEquals(true,Schools.add(new School1("ona", "o", 20,8)));
			assertEquals(true,Schools.add(new School1("lgr","s", 56, 7)));
			assertEquals(false,Schools.add(new School1("lgr", "s", 56, 7)));
			
			
			assertEquals(3, Schools.size());
			for (School1 school1 : Schools) {
				System.out.println(school1);
			}
				
			}
}

