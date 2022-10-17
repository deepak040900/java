package com.stepdefinition.org;

import java.io.IOException;

import com.Maven_project.Baseclass;
import com.fileproperty.org.File_reader_manager;
import com.pom2.org.Page_object_manager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Stepdefinition extends Baseclass {
	public static 	Page_object_manager lg=new Page_object_manager(driver);
	
	@Before
	public void begorehooks(Scenario s) {
      String name = s.getName();
      System.out.println("Scenario Name :"+name);
	}
	
	@After
	public void afterhooks(Scenario s) throws IOException {
		Status status = s.getStatus();
		System.out.println("Scenario ststus"+status);
		if(s.isFailed()) {
			screenshotmethod("");
		}
	}

	
	
	
	
	@Given("^user Must Launch The Url$")
	public void user_Must_Launch_The_Url() throws Throwable {
	String url = File_reader_manager.getinstanceFRM().getinstanceCR().geturl();
	
	launchurl(url);    
	}

	@When("^user Enter The Username In The Username Field$")
	public void user_Enter_The_Username_In_The_Username_Field() throws Throwable {
		String username = File_reader_manager.getinstanceFRM().getinstanceCR().getusername();
		passInput(lg.getInstanceLogin().getEmail(),username);
	}

	@When("^user Enter The Password In The Password Field$")
	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
		String password = File_reader_manager.getinstanceFRM().getinstanceCR().getpassword();
		passInput(lg.getInstanceLogin().getPassword(),password);
	}

	@Then("^user Click The LoginButton It Navigate To The Search Hotel$")
	public void user_Click_The_LoginButton_It_Navigate_To_The_Search_Hotel() throws Throwable {
		press(lg.getInstanceLogin().getLogb());
	}

	@When("^User The Location In The Location Field$")
	public void user_The_Location_In_The_Location_Field() throws Throwable {

		select(lg.getinstanceSearchhotel().getLocation(),"Melbourne");
	}

	@When("^user Select The Hotel In The Hotel Field$")
	public void user_Select_The_Hotel_In_The_Hotel_Field() throws Throwable {
		select(lg.getinstanceSearchhotel().getHotel(),"Hotel Sunshine");
	}

	@When("^user Select The RoomType In The RoomType Field$")
	public void user_Select_The_RoomType_In_The_RoomType_Field() throws Throwable {
		select(lg.getinstanceSearchhotel().getRoom(),"Standard");
	}

	

	@When("^user Enter The CheckInDate In The CheckInDate Field$")
	public void user_Enter_The_CheckInDate_In_The_CheckInDate_Field() throws Throwable {
		String datein = File_reader_manager.getinstanceFRM().getinstanceCR().getdatein();
		passInput(lg.getinstanceSearchhotel().getDate(),datein);
	}

	@When("^user Enter The CheckOutDate In The CheckOutDate Field$")
	public void user_Enter_The_CheckOutDate_In_The_CheckOutDate_Field() throws Throwable {
		String dateout = File_reader_manager.getinstanceFRM().getinstanceCR().getdateout();
		passInput(lg.getinstanceSearchhotel().getDateout(),dateout);
	}

	@When("^user Select The AdultPerRoom In The AdultPerRoom Field$")
	public void user_Select_The_AdultPerRoom_In_The_AdultPerRoom_Field() throws Throwable {
		select(lg.getinstanceSearchhotel().getAdult(),"2");
	}

	@When("^user Select The ChildRoom In The ChildRoom Field$")
	public void user_Select_The_ChildRoom_In_The_ChildRoom_Field() throws Throwable {
		select(lg.getinstanceSearchhotel().getChild(),"2");
	}

	@Then("^user Click The SearchButton And It Navigate To The Select Hotel$")
	public void user_Click_The_SearchButton_And_It_Navigate_To_The_Select_Hotel() throws Throwable {
		press(lg.getinstanceSearchhotel().getSubmit());
	}

	@When("^user Select The RadioButton In The RadioButton Field$")
	public void user_Select_The_RadioButton_In_The_RadioButton_Field() throws Throwable {
		press(lg.getinstanceSelecthotel().getButt());
	}

	@Then("^user Click The ContinueButton And It Navigate To The Book Hotel$")
	public void user_Click_The_ContinueButton_And_It_Navigate_To_The_Book_Hotel() throws Throwable {
		press(lg.getinstanceSelecthotel().getNext());
	}

	@When("^user Enter The FirstName In The FirstName Field$")
	public void user_Enter_The_FirstName_In_The_FirstName_Field() throws Throwable {
		String firstname = File_reader_manager.getinstanceFRM().getinstanceCR().getfirstname();
		passInput(lg.getinstanceBookhotel().getFname(),firstname);
	}

	@When("^user Enter The LastName In The LastName Field$")
	public void user_Enter_The_LastName_In_The_LastName_Field() throws Throwable {
		String lastname = File_reader_manager.getinstanceFRM().getinstanceCR().getlastname();
		passInput(lg.getinstanceBookhotel().getLname(),lastname);
	}

	@When("^user Enter The Adress In The Adress Field$")
	public void user_Enter_The_Adress_In_The_Adress_Field() throws Throwable {
		String adress = File_reader_manager.getinstanceFRM().getinstanceCR().getadress();
		passInput(lg.getinstanceBookhotel().getAddres(),adress);	}

	@When("^user Enter The CardNo In The CardNo Field$")
	public void user_Enter_The_CardNo_In_The_CardNo_Field() throws Throwable {
		String anum = File_reader_manager.getinstanceFRM().getinstanceCR().getanum();
		passInput(lg.getinstanceBookhotel().getAnum(),anum);
	}

	@When("^user Select The CardType In The CardType Field$")
	public void user_Select_The_CardType_In_The_CardType_Field() throws Throwable {
		select(lg.getinstanceBookhotel().getType(),"MAST");
	}

	@When("^user Select The Month In The Month Field$")
	public void user_Select_The_Month_In_The_Month_Field() throws Throwable {
		select(lg.getinstanceBookhotel().getMonth(),"4");
	}

	@When("^user Select The Year In The Year Field$")
	public void user_Select_The_Year_In_The_Year_Field() throws Throwable {
		select(lg.getinstanceBookhotel().getYear(),"2014");
	}

	@When("^user Select The Cvv In The Cvv Field$")
	public void user_Select_The_Cvv_In_The_Cvv_Field() throws Throwable {
		String cvv = File_reader_manager.getinstanceFRM().getinstanceCR().getcvv();
		passInput(lg.getinstanceBookhotel().getCvv(),cvv);
	}

	@Then("user Click The BookButton And It Navigate To The Logout")
	public void user_click_the_book_button_and_it_navigate_to_the_logout() {
		press(lg.getinstanceBookhotel().getBook());
}
	@When("user Enter The Logout In The Logout Field")
	public void user_enter_the_logout_in_the_logout_field() {
		press(lg.getinstanceLogout().getOut());
}
}