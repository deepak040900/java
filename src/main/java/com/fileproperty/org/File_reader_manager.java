package com.fileproperty.org;

import java.io.IOException;

public class File_reader_manager {
	
	private File_reader_manager() {
	}
	
	public static File_reader_manager getinstanceFRM() {
		File_reader_manager frm=new File_reader_manager();
		return frm;

	}
	
  public  Configuration_reader getinstanceCR() throws IOException {
	  Configuration_reader cr=new Configuration_reader();
	return cr;
}
}
