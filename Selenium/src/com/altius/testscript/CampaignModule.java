package com.altius.testscript;

import java.time.Duration;

import org.testng.annotations.Test;

import com.altius.POM.CampaignListPage;
import com.altius.POM.CampaignPage;
import com.altius.POM.HomePage;
import com.altius.generic.BaseClass;

public class CampaignModule extends BaseClass{

	@Test
	public void CreateCampaign(){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		HomePage hp=new  HomePage(driver);
		hp.setHomePage();
		CampaignListPage cl=new CampaignListPage(driver);
		cl.setNewCampaign();
		CampaignPage cp=new CampaignPage(driver);
		cp.SetCampaign();

	}
}
