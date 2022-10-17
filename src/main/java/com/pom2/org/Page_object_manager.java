package com.pom2.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pomclass.org.Bookhotel;
import com.pomclass.org.Login_page;
import com.pomclass.org.Logout;
import com.pomclass.org.Searchhotel;
import com.pomclass.org.Selecthotel;

public class Page_object_manager {
    public WebDriver driver;
    
    private Login_page lp;

	public Page_object_manager(WebDriver driver2) {
		
		this.driver=driver2;
		 
	}

	
	public Login_page getInstanceLogin() {
		
		if(lp==null) {
			lp=new Login_page(driver);
		}
		return lp;
	}
    
    private Searchhotel sh;

	
    public Searchhotel getinstanceSearchhotel() {
    	if(sh==null) {
    		sh=new Searchhotel(driver);
    	}
		return sh;
		

	}
    private Selecthotel s;
    public Selecthotel getinstanceSelecthotel() {
    	if(s==null) {
    	s=new Selecthotel(driver);	
    	}
    	return s;
    }
    private Bookhotel bh;
    public Bookhotel getinstanceBookhotel() {
    	if(bh==null) {
    		bh=new Bookhotel(driver);
    	}
		return bh;
    		
    }
    private Logout l;
    public Logout getinstanceLogout() {
    	if(l==null) {
    		l=new Logout(driver);
    	}
		return l;
    }
    
}
