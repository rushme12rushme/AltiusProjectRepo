package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsuranceDOB {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder='Policy Number']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@placeholder='DOB']")).click();
		WebElement monthList = driver.findElement(By.className("ui-datepicker-month"));
		Select s= new Select(monthList);
		s.selectByIndex(11);
		WebElement YearList = driver.findElement(By.className("ui-datepicker-year"));
		Select s1= new Select(YearList);
		s1.selectByValue("1984");
		driver.findElement(By.xpath("//td/a[text()='12']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Contact Number']")).sendKeys("9845098450");
		driver.findElement(By.xpath("//button[@id='renew_policy_submit']")).click();
		String str = driver.findElement(By.xpath("//span[@id='policynumberError']")).getText();
		boolean b =driver.findElement(By.xpath("//span[@id='policynumberError']")).isDisplayed();

		if(str.equals("Please enter valid Policy No.") && b==true)
		{
		}System.out.println(" Text is Displayed correctly");
		
		driver.quit();
		
		
		
		
		

	
	}

}
