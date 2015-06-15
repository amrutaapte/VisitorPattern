package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import terminal.App;

public class testTerminal {
	
	@Test
	public void testGetTotal1(){
		assertEquals(32.40f, App.processString("ABCDABAA"), 0.001);
	}

	@Test
	public void testGetTotal2(){
        assertEquals(7.25f, App.processString("CCCCCCC"), 0.001);		
	}

	@Test
	public void testGetTotal3(){
		assertEquals(15.40f, App.processString("ABCD"), 0.001);
	}


	@Test
	public void testGetTotalWithBlankInput(){
		assertEquals(0, App.processString(""), 0.001);
	}
	

	@Test
	public void testGetTotalWithInvalidInput(){
		assertEquals(0, App.processString("ZZ>"), 0.001);
	}
	
}
