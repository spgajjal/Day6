package com.capgemini.domain;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.TreeSet;

//import javax.swing.text.html.HTMLDocument.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.junit.Test;



public class Question4 {
	@Test
	public void testorder()
	{
		TreeSet<String> array= new TreeSet<>((a1,a2)->{
			return a1.compareTo(a2);});
	
		array.add("anu");
		array.add("nikhi");
		array.add("ram");
		array.add("ani");
			
		
		Iterator<String> itr= array.iterator();
			assertEquals("ani",itr.next().toString());
			assertEquals("ram",itr.next());
		//Iterator<String> itr= array.iterator();
	}

}
