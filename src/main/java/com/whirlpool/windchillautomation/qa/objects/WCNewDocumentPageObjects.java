package com.whirlpool.windchillautomation.qa.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WCNewDocumentPageObjects {

	@FindBy(xpath="//button[text()='New Document']")
	WebElement newDocumentButton;

	@FindBy(xpath="//select[@id='createType']")
	WebElement docType;

	@FindBy(xpath="//input[@id='primaryFilepathInput']")
	WebElement primaryContent;

	@FindBy(xpath="//td[text()='Name:']/following-sibling::td[1]/input[1]")
	WebElement docName;

	@FindBy(xpath="//select[@id='DocOwnerGroup']") 
	WebElement docOwnerGroup;

}
