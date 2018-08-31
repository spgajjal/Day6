package com.capgemini.domain.test;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgemini.domain.Car;

class Question5Test{

	@Test
	void testCarDetails() {
		Car c1,c2,c3,c4 ;
		Comparator<Car> modelComparator=(car1, car2) -> {
			return car1.getMake().compareTo(car2.getMake()) ;
			};
			
			TreeSet<Car> array = new TreeSet<>(modelComparator);
			c1=new Car("Honda","city1",2000,10000000) ;
			c2=new Car("Chevrolet","model2",2005,200000) ;
			c3=new Car("Honda","Brio",2018,700000) ;
			array.add(c1) ;
			array.add(c2) ;
			array.add(c3) ;
			Iterator<Car> itr = array.iterator();
			assertEquals(new Car("Chevrolet","model2",2005,200000),itr.next());
		

}
}