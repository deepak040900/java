package com.testng.structure;

import org.testng.annotations.Test;

public class depenceny {
	@Test
	public void tenth() {
		System.out.println("tenth");
	}
@Test(dependsOnMethods ="tenth" )
	public void twelth() {
		System.out.println("twelth");
	}

}
