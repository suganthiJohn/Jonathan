package org.test;

import org.testng.annotations.Test;

public class Grouping3 {
	@Test(groups="regression")
	public void Tc100() {
		System.out.println("Tc100");

	}
	@Test(groups="rerun")
	public void Tc200() {
		System.out.println("TC200");

	}
	
	@Test(groups="sanity")
	public void Tc300() {
		System.out.println("Tc300");

	}

}
