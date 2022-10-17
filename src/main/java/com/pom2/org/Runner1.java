package com.pom2.org;

import org.openqa.selenium.WebDriver;

import com.Maven_project.Baseclass;

public class Runner1 extends Baseclass {
	
	
	public static WebDriver driver=launchBrowser();
public static 	Page_object_manager lg=new Page_object_manager(driver);
	
	public static void main(String[] args) {
		
		
		launchurl("https://adactinhotelapp.com/SearchHotel.php");
		passInput(lg.getInstanceLogin().getEmail(),"deepak040900");
		passInput(lg.getInstanceLogin().getPassword(),"deepak@25");
		press(lg.getInstanceLogin().getLogb());
		
		select(lg.getinstanceSearchhotel().getLocation(),"Melbourne");
		select(lg.getinstanceSearchhotel().getHotel(),"Hotel Sunshine");
		select(lg.getinstanceSearchhotel().getRoom(),"Standard");
		passInput(lg.getinstanceSearchhotel().getDate(),"20/09/2022");
		passInput(lg.getinstanceSearchhotel().getDateout(),"21/09/2022");
		select(lg.getinstanceSearchhotel().getAdult(),"2");
		select(lg.getinstanceSearchhotel().getChild(),"2");
		press(lg.getinstanceSearchhotel().getSubmit());
	     
		press(lg.getinstanceSelecthotel().getButt());
		press(lg.getinstanceSelecthotel().getNext());
		
		passInput(lg.getinstanceBookhotel().getFname(),"deepak");
		passInput(lg.getinstanceBookhotel().getLname(),"s");
		passInput(lg.getinstanceBookhotel().getAddres(),"qwerttyuii");
		passInput(lg.getinstanceBookhotel().getAnum(),"1234567890123456");
		select(lg.getinstanceBookhotel().getType(),"MAST");
		select(lg.getinstanceBookhotel().getMonth(),"4");
		select(lg.getinstanceBookhotel().getYear(),"2014");
		passInput(lg.getinstanceBookhotel().getCvv(),"1234");
		press(lg.getinstanceBookhotel().getBook());
		
		press(lg.getinstanceLogout().getOut());
	}

}
