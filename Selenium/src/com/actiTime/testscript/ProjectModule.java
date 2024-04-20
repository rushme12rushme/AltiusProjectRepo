package com.actiTime.testscript;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actiTime.POM.ProjectPage;
import com.actiTime.generic.BaseClass;
import com.actiTime.generic.FileLib;

import dev.failsafe.internal.util.Assert;

public class ProjectModule  extends BaseClass{
	@Test
	public void createProject() throws EncryptedDocumentException, IOException
		{
			Reporter.log("Create Project",true);
			
			ProjectPage p=new ProjectPage(driver);
			FileLib fl=new FileLib();
			String projectName=fl.getExcelFileData("CreateProject", 1, 0);
			String projectDesc=fl.getExcelFileData("CreateProject", 1, 1);

			p.setNewProject(projectName,projectDesc);
			
			
			WebElement actual=driver.findElement(By.xpath("(//div[@class='title ellipsis'])[3]"));
		String exp_projectName=fl.getExcelFileData("CreateProject", 1, 0);
					assertEquals(actual.getText(),exp_projectName);
					

			
		}
}
		
