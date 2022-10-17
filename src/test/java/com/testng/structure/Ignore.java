package com.testng.structure;

import org.apache.commons.io.filefilter.FalseFileFilter;
import org.testng.annotations.Test;

public class Ignore {
	
	@Test
	public void parattoa() {
		System.out.println("paratto");
	}
	@Test(enabled=false)
	public void idly() {
		System.out.println("idly");

}
	@Test
	public void dosa() {
		System.out.println("dosa");
	}
	@Test
	public void chicken() {
System.out.println("chicken");
	}
}
