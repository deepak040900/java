package com.pomclass.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecthotel {
  public WebDriver driver;
	public Selecthotel(WebDriver driver2) {
		this. driver=driver2;
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getButt() {
		return butt;
	}
	public WebElement getNext() {
		return next;
	}
	@FindBy(id="radiobutton_0")
	private WebElement butt;
	@FindBy(id="continue")
	private WebElement next;
}
