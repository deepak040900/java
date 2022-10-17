package com.pomclass.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookhotel {
	public WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement fname;
	public Bookhotel (WebDriver driver2) {
		
		this. driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getAddres() {
		return addres;
	}
	public WebElement getAnum() {
		return anum;
	}
	public WebElement getType() {
		return type;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBook() {
		return book;
	}
	@FindBy(id="last_name")
	private WebElement lname;
	@FindBy(id="address")
	private WebElement addres;
	@FindBy(id="cc_num")
	private WebElement anum;
	@FindBy(id="cc_type")
	private WebElement type;
	@FindBy(id="cc_exp_month")
	private WebElement month;
	@FindBy(id="cc_exp_year")
	private WebElement year;
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(xpath="//input[@type='button']")
	private WebElement book;
}
