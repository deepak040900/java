package com.testng.structure;

import org.testng.annotations.Test;

public class Timeout {
	@Test(timeOut = 7000)
	public void facebook() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("login");
		
		Thread.sleep(2000);
		System.out.println("logout");
		
		Thread.sleep(2000);
		System.out.println("username");
	}

}
