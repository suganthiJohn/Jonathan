package org.test;

import org.testng.annotations.Test;

public class Grouping1 {
	
	
	@Test(groups="smoke")
	public void Tc1() {
		System.out.println("TC1");

	}
	
	@Test(groups="sanity")
	public void Tc2() {
		System.out.println("TC2");

	}
	
	@Test(groups="regression")
	public void Tc3() {
	System.out.println("TC3");

	

	}

}
