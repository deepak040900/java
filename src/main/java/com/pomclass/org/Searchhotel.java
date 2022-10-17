package com.pomclass.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhotel {
	public WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	public Searchhotel (WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoom() {
		return room;
	}
	public WebElement getDate() {
		return  date;
	}
	public WebElement getDateout() {
		return  dateout;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSubmit() {
		return submit;
	}
	@FindBy(id="hotels")
	private WebElement hotel;
	@FindBy(id="room_type")
	private WebElement room;
	@FindBy(id="datepick_in")
	private WebElement date;
	@FindBy(id="datepick_out")
	private WebElement dateout;
	@FindBy(id="adult_room")
	private WebElement adult;
	@FindBy(id="child_room")
	private WebElement child ;
	@FindBy(id="Submit")
	private WebElement submit;
	
	}

