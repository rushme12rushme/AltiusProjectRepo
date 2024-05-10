package com.altius.POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CampaignPage {
	@FindBy (name="(property(Campaign Name))")
	private WebElement CampaignNametxtbx;
	
	@FindBy (name="(property(Start Date)")
	private WebElement StartDatetbx;
	
	@FindBy (name="property(Expected Revenue)")
	private WebElement ExpectedRevenuetbx;
	
	@FindBy (name="property(Actual Cost)")
	private WebElement ActualCosttbx;
	

	@FindBy (name="property(Num sent)")
	private WebElement NumSenttbx;
	

	@FindBy (name="property(Type)")
	private WebElement CampaignTypeDropDown;
	
	@FindBy (name="property(Status)")
	private WebElement CampaignStatusDropDown;

	@FindBy (name="property(End Date)")
	private WebElement EndDatetbx;
	
	@FindBy (xpath="//input[@name='property(Budgeted Cost)']")
	private WebElement BudgetedCosttbx;
	
	@FindBy (name="property(Expected Response)")
	private WebElement ExpectedResponsetbx;
	
	@FindBy (name="property(Description)")
	private WebElement Descriptiontbx;
	
	@FindBy (xpath="(//input[@value='Save'])[2]")
	private WebElement SaveBtn;
	
	public CampaignPage(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
	
	public void SetCampaign() {

		CampaignNametxtbx.sendKeys("Rashmi");
		StartDatetbx.sendKeys("04/30/2024");
		ExpectedRevenuetbx.sendKeys("500000");
		ActualCosttbx.sendKeys("10000");
		NumSenttbx.sendKeys("5");
		Select s=new Select(CampaignTypeDropDown);
		s.selectByValue("Trade Show");
		Select s1=new Select(CampaignStatusDropDown);
		s1.selectByValue("Planning");
		EndDatetbx.sendKeys("05/01/2024");
		BudgetedCosttbx.sendKeys("45000");
		ExpectedResponsetbx.sendKeys("1000");
		Descriptiontbx.sendKeys("Demo Description");
		SaveBtn.click();
		//use gettext to check the text using assert
	}
	}
	
	
	
	


