package com.actiTime.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tasks {
	@FindBy (xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy (xpath="//div[contains(text(),'New Customer')]")
	private WebElement NewCustTab;
	
	
	
	
	
	
	

}
