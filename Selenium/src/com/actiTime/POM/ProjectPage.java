package com.actiTime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectPage {
	@FindBy (xpath="//div[contains(text(),'TASKS')]")
	private WebElement TasksBtn;
	
	@FindBy (xpath="(//div[contains(text(),'Add New')])[1]")
	private WebElement AddNewBtn;
	
	@FindBy (xpath="//div[contains(text(),'+ New Project')]")
	private WebElement NewProjectBtn;
	
	@FindBy (xpath="(//input[@class='projectNameField inputFieldWithPlaceholder'])[1]")
	private WebElement ProjectNameTxtBx;
	
	@FindBy (xpath="//button[contains(text(),'-- Please Select Customer to Add Project for  --')]")
	private WebElement CustomerNameDropDown;
	
	@FindBy (xpath="//a[text()='HDFC_001']")
	private WebElement CustomerNameOption;
	

	@FindBy (xpath="//textarea[@id='projectPopup_projectDescriptionField']")
	private WebElement ProjectDescription;
	

	@FindBy (xpath="//span[text()='Create Project']")
	private WebElement CreateProjectBtn;
	
	
	public ProjectPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void setNewProject(String Project_Name,String Project_Description)
	{
		TasksBtn.click();
		AddNewBtn.click();
		NewProjectBtn.click();
		ProjectNameTxtBx.sendKeys(Project_Name);
		CustomerNameDropDown.click();
		CustomerNameOption.click();
		ProjectDescription.sendKeys(Project_Description);
		CreateProjectBtn.click();
		
		
		
		
	}
}
