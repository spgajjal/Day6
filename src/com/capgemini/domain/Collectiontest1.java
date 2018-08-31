package com.capgemini.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.domain.Car;
import com.capgemini.domain.CellPhone;
import com.capgemini.domain.Laptop;
import com.capgemini.domain.School;
import com.capgemini.domain.Television;

class Collectiontest1 {
	
	@Test
	void testLaptopProducts() {
		ArrayList<Laptop> laptops = new ArrayList<Laptop>();
		
		 laptops.add(new Laptop("Dell", "Inspiron5558", "Windows 8", "i5"));
		laptops.add(new Laptop("HP", "HP234", "Windows 10", "i3"));
		laptops.add(new Laptop("HP", "HP677", "Windows 10", "i7"));
		
		assertEquals(3, laptops.size());
		for (Laptop laptop : laptops) {
			System.out.println(laptop);
			
		}
	}
	@Test
		void testCarProduts() {
			ArrayList<Car> Car=new ArrayList<Car>();
			
			Car.add(new Car("honda","v66",2000,400000));
			Car.add(new Car("susi","v67",2001,50000));
			Car.add(new Car("hoa","v68",2001,40000));
			assertEquals(3, Car.size());
			for (Car car2 : Car) {
				System.out.println(car2);
				
			}

	}
	@Test
		void testTelevisionProducts() {
			ArrayList<Television> t1 = new ArrayList<Television>();
			
			t1.add(new Television("samsung","s4", 70_000, 56));
			t1.add(new Television("lg", "l5", 50_000, 79));
			t1.add(new Television("onida", "o2", 60_000, 220));
			
			assertEquals(3, t1.size());
	}
	@Test
		void testCellphoneProducts() {
			ArrayList<CellPhone> cell = new ArrayList<CellPhone>();
			
			cell.add(new CellPhone("samsung","s4", 56, "hgsfh",70_000));
			cell.add(new CellPhone("lgr", "l5", 79, "xd",50_000));
			cell.add(new CellPhone("onida", "o2", 220,"dfg", 60_000));
			
			assertEquals(3, cell.size());
	}
	@Test
		void testSchoolProducts() {
			ArrayList<School> Schools = new ArrayList<School>();
			
			Schools.add(new School("samsung","s4", 56, 5));
			Schools.add(new School("lgr", "l5", 79, 6));
			Schools.add(new School("onida", "o2", 220,4));
			
			assertEquals(3, Schools.size());
	}
	}


