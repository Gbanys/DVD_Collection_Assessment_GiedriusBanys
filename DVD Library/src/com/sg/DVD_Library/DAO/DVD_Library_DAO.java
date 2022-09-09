package com.sg.DVD_Library.DAO;

import java.util.List;

import com.sg.DVD_Library.DTO.DVD;

public interface DVD_Library_DAO {

	DVD addDVD(String title, DVD dvd) throws DVD_Library_DAO_Exception;
	
	DVD removeDVD(String title) throws DVD_Library_DAO_Exception;
	
	List<DVD> getAllDVDs() throws DVD_Library_DAO_Exception;
	
	DVD getDVD(String title) throws DVD_Library_DAO_Exception;
	
	DVD editDVDInformation(String title, String pieceOfInformation, String change) throws DVD_Library_DAO_Exception;
	
	
}
