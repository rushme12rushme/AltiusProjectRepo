package com.actiTime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy (className="logout")
	private WebElement lgoutBtn;
	
	@FindBy (xpath="//div[text()='TASKS']")
	private WebElement tasksTab; 
	
	public HomePage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	 public void setLogout()
	 {
		 lgoutBtn.click(); 
	 }
	 
	 public void setTasksTab()
	 {
		 tasksTab.click(); 
	 }
	 

}
