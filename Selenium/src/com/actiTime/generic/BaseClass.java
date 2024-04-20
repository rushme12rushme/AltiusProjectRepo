package com.actiTime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver;
	@BeforeClass
	public void OpenBrowser() {
		
		 driver =new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod
	public void login() throws IOException
		{
		Reporter.log("Login",true);
		FileLib fl=new FileLib();
		
		String url=fl.getPropertyFileData("url");
		driver.get(url);
		String un=fl.getPropertyFileData("username");
		String pwd=fl.getPropertyFileData("pwd");
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();

	}
	@AfterMethod
	public void Logout() {
		Reporter.log("Logout",true);
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("Logout");
	}
	

}
