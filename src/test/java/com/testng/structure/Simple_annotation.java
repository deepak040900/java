package com.testng.structure;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_annotation {
	@BeforeSuite
	public void setproperty() {
		System.out.println("property");

	}

	@BeforeTest
	public void browser() {
		System.out.println("openbrowser");
	}

	@BeforeClass
	public void url() {
		System.out.println("geturl");
	}

	@BeforeMethod
	public void login() {
		System.out.println("login");
	}

	@Test(priority = 2, invocationCount = 2)
	public void men() {
		System.out.println("men");
	}

	@Test(priority = 1)
	public void women() {
		System.out.println("women");
	}

	@Test(priority = 3)
	public void kids() {
		System.out.println("kids");
	}

	@AfterMethod
	public void logout() {
		System.out.println("logout");

	}

	@AfterClass
	public void screenshot() {
		System.out.println("screen");
	}

	@AfterTest
	public void refresh() {
		System.out.println("ref");
	}

	@AfterSuite
	public void close() {
		System.out.println("close");
	}

}
