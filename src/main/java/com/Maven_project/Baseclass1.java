package com.Maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass1 {
	public static WebDriver driver;
	public static void launchBrowser() {
		

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
			 driver= new ChromeDriver();
		     driver.manage().window().maximize();		
			}
	     public static void  launchurl(String url) {
	    	 driver.get(url);
	     }
        public static void press(String clk) {
        	
        }
}
