package com.Maven_project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver driver;
	
	public static WebDriver launchBrowser() {
		

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\Newdriver\\chromedriver.exe");
			driver= new ChromeDriver();
		     driver.manage().window().maximize();
			return driver;		
			}
			
	
	public static void launchurl(String url) {
		
		driver.get(url);
	}
	public static void passInput(WebElement element,String input ) {
		element.sendKeys(input);
		
	}
	public static void press(WebElement button) {
		button.click();
	}
	
	public static void select(WebElement location,String value) {
		Select s=new Select(  location);
		s.selectByValue(value);
		
		
	}
	public static void screenshotmethod(String location) throws IOException {
      TakesScreenshot ts= (TakesScreenshot)driver;
      File src = ts.getScreenshotAs(OutputType.FILE);
      File dest= new File(location);
      FileUtils.copyFile(src, dest);
	}
	
	}


		
		 
		 
		 
	
