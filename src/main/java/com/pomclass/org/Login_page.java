package com.pomclass.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
     public WebDriver driver;
     
     public Login_page(WebDriver driver2) {
    	 this.driver=driver2;
    	 PageFactory.initElements(driver, this);
     }
     

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogb() {
		return logb;
	}

	@FindBy(id="username")
     private WebElement email;
     
     @FindBy(id="password")
     private WebElement password;
     
     @FindBy(id="login")
     private WebElement logb;
     
}
