package com.fileproperty.org;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Maven_project.Baseclass;
import com.pom2.org.Page_object_manager;

public class Runner_property extends Baseclass{
	public static WebDriver driver=launchBrowser();
	public static 	Page_object_manager lg=new Page_object_manager(driver);
		
		public static void main(String[] args) throws IOException {
			String url = File_reader_manager.getinstanceFRM().getinstanceCR().geturl();
			
			launchurl(url);
			String username = File_reader_manager.getinstanceFRM().getinstanceCR().getusername();
			passInput(lg.getInstanceLogin().getEmail(),username);
			String password = File_reader_manager.getinstanceFRM().getinstanceCR().getpassword();
			passInput(lg.getInstanceLogin().getPassword(),password);
			press(lg.getInstanceLogin().getLogb());
			
			
			select(lg.getinstanceSearchhotel().getLocation(),"Melbourne");
			select(lg.getinstanceSearchhotel().getHotel(),"Hotel Sunshine");
			select(lg.getinstanceSearchhotel().getRoom(),"Standard");
			String datein = File_reader_manager.getinstanceFRM().getinstanceCR().getdatein();
			passInput(lg.getinstanceSearchhotel().getDate(),datein);
			String dateout = File_reader_manager.getinstanceFRM().getinstanceCR().getdateout();
			passInput(lg.getinstanceSearchhotel().getDateout(),dateout);
			select(lg.getinstanceSearchhotel().getAdult(),"2");
			select(lg.getinstanceSearchhotel().getChild(),"2");
			press(lg.getinstanceSearchhotel().getSubmit());
		     
			press(lg.getinstanceSelecthotel().getButt());
			press(lg.getinstanceSelecthotel().getNext());
			
			String firstname = File_reader_manager.getinstanceFRM().getinstanceCR().getfirstname();
			passInput(lg.getinstanceBookhotel().getFname(),firstname);
			String lastname = File_reader_manager.getinstanceFRM().getinstanceCR().getlastname();
			passInput(lg.getinstanceBookhotel().getLname(),lastname);
			String adress = File_reader_manager.getinstanceFRM().getinstanceCR().getadress();
			passInput(lg.getinstanceBookhotel().getAddres(),adress);
			String anum = File_reader_manager.getinstanceFRM().getinstanceCR().getanum();
			passInput(lg.getinstanceBookhotel().getAnum(),anum);
			select(lg.getinstanceBookhotel().getType(),"MAST");
			select(lg.getinstanceBookhotel().getMonth(),"4");
			select(lg.getinstanceBookhotel().getYear(),"2014");
			String cvv = File_reader_manager.getinstanceFRM().getinstanceCR().getcvv();
			passInput(lg.getinstanceBookhotel().getCvv(),cvv);
			
			press(lg.getinstanceBookhotel().getBook());
			
			press(lg.getinstanceLogout().getOut());
		}

	}

	


