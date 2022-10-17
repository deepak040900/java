package com.Maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner extends Baseclass{
	
	public static void main(String[] args) {
		

		
		launchBrowser();
		launchurl("https://adactinhotelapp.com/index.php");
		
		WebElement email = driver.findElement(By.id("username"));
		passInput(email,"deepak040900");
		
		WebElement pass = driver.findElement(By.id("password"));
		passInput(pass,"deepak@25");
		
		WebElement click = driver.findElement(By.id("login"));
		press(click);
		
		WebElement f1 = driver.findElement(By.id("location"));
		select(f1,"London");
		WebElement f2 = driver.findElement(By.id("hotels"));
		select(f2,"Hotel Sunshine");
		WebElement f3 = driver.findElement(By.id("room_type"));
		select(f3,"Double");
		WebElement f4 = driver.findElement(By.id("datepick_in"));
		passInput(f4,"17/09/2022");
		WebElement f5 = driver.findElement(By.id("datepick_out"));
		passInput(f5,"18/09/2022");
		WebElement f6 = driver.findElement(By.id("adult_room"));
		select(f6,"2");
		WebElement f7 = driver.findElement(By.id("child_room"));
		select(f7,"2");
		WebElement f8 = driver.findElement(By.id("Submit"));
		press(f8);
		WebElement f9 = driver.findElement(By.id("radiobutton_0"));
		press(f9);
		WebElement f10 = driver.findElement(By.id("continue"));
		press(f10);
		WebElement f11 = driver.findElement(By.xpath("//input[@name='first_name']"));
		passInput(f11,"deepak");
		WebElement f12 = driver.findElement(By.id("last_name"));
		passInput(f12,"s");
		WebElement f13 = driver.findElement(By.id("address"));
		passInput(f13,"xxxxxxxxxxxxxxxxx");
		WebElement f14 = driver.findElement(By.id("cc_num"));
		passInput(f14,"1234567890123456");
		WebElement f15 = driver.findElement(By.xpath("(//select[@name='cc_type'])[1]"));
		select(f15,"AMEX");
		WebElement f16 = driver.findElement(By.id("cc_exp_month"));
		select(f16,"9");
		WebElement f17 = driver.findElement(By.id("cc_exp_year"));
		select(f17,"2021");
		WebElement f18 = driver.findElement(By.id("cc_cvv"));
		passInput(f18,"1234");
		WebElement f19 = driver.findElement(By.id("book_now"));
		press(f19);
		WebElement f20 = driver.findElement(By.linkText("Logout"));
		press(f20);
	}
	
}
