package com.pomclass.org;

import org.openqa.selenium.WebElement;

import com.Maven_project.Baseclass;

public class Runner extends Baseclass {
	public static void main(String[] args) {
		
		launchBrowser();
		launchurl("https://adactinhotelapp.com/SearchHotel.php");
		Login_page pg=new Login_page(driver);
		passInput(pg.getEmail(),"deepak040900");
		passInput(pg.getPassword(),"deepak@25");
		press(pg.getLogb());
		
		Searchhotel sh=new Searchhotel(driver);
		select(sh.getLocation(),"Melbourne");
		select(sh.getHotel(),"Hotel Sunshine");
		select(sh.getRoom(),"Standard");
		passInput(sh.getDate(),"20/09/2022");
		passInput(sh.getDateout(),"21/09/2022");
		select(sh.getAdult(),"2");
		select(sh.getChild(),"2");
		press( sh.getSubmit());
		
		Selecthotel s=new Selecthotel(driver);
		press(s.getButt());
		press(s.getNext());
		
		Bookhotel bh =new Bookhotel(driver);
		passInput(bh.getFname(),"deepak");
		passInput(bh.getLname(),"s");
		passInput(bh.getAddres(),"sdfghjkkllkjhhh");
		passInput(bh.getAnum(),"1234567890123456");
		select(bh.getType(),"MAST");
		select(bh.getMonth(),"4");
		select(bh.getYear(),"2015");
		passInput(bh.getCvv(),"2345");
		press(bh.getBook());
		
		Logout l=new Logout(driver);
		press(l.getOut());
		
	}

}
