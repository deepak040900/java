package com.testng.structure;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups = "games")
	public void football() {
System.out.println("football");
	}
	@Test(groups = "games")
	public void cricket() {
		System.out.println("cricket");

}
	@Test(groups = "games")
	public void koko() {
		System.out.println("koko");
		}
	@Test(groups = "food")
	public void idly() {
		System.out.println("idly");
	}
	@Test(groups = "food")
	public void dosa() {
		System.out.println("dosa");
		}
	@Test(groups = "food")
	public void idiyappam() {
		System.out.println("idiyappam");
	}
}
	
