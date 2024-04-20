package com.actiTime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoTestNG {
	@Test
public void demo()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	String atitle=driver.getTitle();
	String Etitle="oogle";
	SoftAssert s = new SoftAssert();
	s.assertEquals(atitle, Etitle);
	Reporter.log("Welcome to testing",true);
	driver.quit();
	s.assertAll();
}
}

