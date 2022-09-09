package com.sg.DVD_Library;

import com.sg.DVD_Library.Controller.DVD_Library_Controller;
import com.sg.DVD_Library.DAO.DVD_Library_DAO;
import com.sg.DVD_Library.DAO.DVD_Library_daoFileImpl;
import com.sg.DVD_Library.UI.DVD_Library_View;
import com.sg.DVD_Library.UI.UserIO;
import com.sg.DVD_Library.UI.UserIOConsoleImpl;

public class Main {

	public static void main(String[] args) {
		
		//Use dependency injection and wire the entire application.
		
		UserIO myIo = new UserIOConsoleImpl();
		DVD_Library_DAO myDao = new DVD_Library_daoFileImpl();
		DVD_Library_View myView = new DVD_Library_View(myIo);
		DVD_Library_Controller Controller = new DVD_Library_Controller(myView, myDao);
		Controller.run();
		
	}

}
