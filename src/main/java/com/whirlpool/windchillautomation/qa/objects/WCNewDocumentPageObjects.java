package com.whirlpool.windchillautomation.qa.objects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.whirlpool.windchillautomation.qa.base.DriverInitialization;

public class WCNewDocumentPageObjects extends DriverInitialization {

	public WCNewDocumentPageObjects() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//button[text()='New Document']")
	protected WebElement newDocumentButton;

	@FindBy(xpath="//select[@id='createType']")
	protected WebElement docType;

	@FindBy(xpath="//input[@id='primaryFilepathInput']")
	protected WebElement primaryContent;

	@FindBy(xpath="//td[text()='Name:']/following-sibling::td[1]/input[1]")
	protected WebElement docName;

	@FindBy(xpath="//select[@id='DocOwnerGroup']") 
	protected WebElement docOwnerGroup;

}
