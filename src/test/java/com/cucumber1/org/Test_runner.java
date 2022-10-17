package com.cucumber1.org;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Maven_project.Baseclass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature",glue = "com.stepdefinition.org",
                    
                    monochrome=true,dryRun= false, 
                    tags=("@SmokeTest"),
                    plugin={"html:Report","com.cucumber.listener.ExtentCucumberFormatter:Report/Adact.html"})
                                                        
public class Test_runner {
	
	public static WebDriver driver;
		
   @BeforeClass	
  public static void setup() {
	   driver=Baseclass.launchBrowser();
  
}
   @AfterClass
  public static void tearDown() {
	  // driver.close();

}
}
