package com.whirlpool.windchillautomation.qa.pages;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;

import com.whirlpool.windchillautomation.qa.objects.WCNewDocumentPageObjects;
import com.whirlpool.windchillautomation.qa.util.Utilities;
import com.whirlpool.windchillautomation.qa.util.Xls_Reader;

/**
 * 
 * @author SHINDA1
 *
 */

public class WCNewDocumentPage extends WCNewDocumentPageObjects {
	public WCNewDocumentPage() throws IOException
	{
		super();
		
	}
	String testDataFilePath =properties.getProperty("testdatafilepath");
	Xls_Reader reader = new Xls_Reader(testDataFilePath);
	Utilities wob;
	
	
	public WCNewDocumentPage populateAllNonCadAttribute() {
		
		String type	=reader.getCellData("NonCadDoc", "DocType", 2);
		Select doctype=new Select(docType);
		doctype.selectByVisibleText(type);
		
		String primarycontent= reader.getCellData("NonCadDoc", "PrimaryContent", 2);
		
		
		
		
		
		
		
		return this;
		
	}
	
	
	
	
	
}
