package org.test;

import org.testng.annotations.Test;

public class Grouping2 {
	
	@Test(groups="sanity")
	public void Tc10() {
		System.out.println("Tc10");

	}
	
	@Test(groups="rerun")
	public void Tc20() {
		System.out.println("Tc20");

	}
	@Test(groups="sanity")
	public void Tc30() {
		System.out.println("TC30");

	}
	
	

}
