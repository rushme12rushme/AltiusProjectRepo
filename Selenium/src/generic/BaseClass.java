package generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;






public class BaseClass {	
	public static WebDriver driver;
	@BeforeClass
	public void OpenBrowser() {
		System.out.println("OPen browser");
		 driver =new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterClass
	public void CloseBrowser() {
		
		 driver.close();
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
		
		
	}
	
	
	}
	


