package com.fileproperty.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_reader {
    public static Properties p;
	private String username;
    public Configuration_reader() throws IOException {
    	
    	 File f=new File("C:\\Users\\deepak\\eclipse-workspace\\Maven_project\\src\\main\\java\\com\\fileproperty\\org\\Adactin.properties");
	 		
	 		FileInputStream f1=new FileInputStream(f);
	 		
	 		 p=new Properties();
	 		p.load(f1);
    	
    }
     
	public String geturl() throws IOException {
		
		
		String url = p.getProperty("url");
		
		return url;
	}
	
	public String getusername() throws IOException {
		
			
			String username = p.getProperty("username");
			
			
			return   username;
     
	}
	public String getpassword() throws IOException {
		
		String password = p.getProperty("password");
		return password;

	}
	
	

public  String getdatein() throws IOException {
	
		String datein = p.getProperty("datein");
		return datein;
}
public String getdateout() throws IOException {
	 
		String dateout = p.getProperty("dateout");
		return dateout;
}


public String getfirstname() throws IOException {
		String firstname = p.getProperty("firstname");
		return firstname;
}
public String getlastname() throws IOException {
	
		String lastname = p.getProperty("lastname");
		return lastname;

}
public String getadress() throws IOException {
	
		String adress = p.getProperty("adress");
		return adress;

}
public String getanum() throws IOException {
	
		String anum = p.getProperty("anum");
		return anum;
}



public String getcvv() throws IOException {
	
		String cvv = p.getProperty("cvv");
		return cvv;
}

}