package qsp;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BDDPRac {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//div[text()='TASKS']")).click();
		String cusname="Smith";
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[contains(text(),'"+cusname+"')])[1]/../div[@class='editButton available']")));
		WebElement  e= driver.findElement(By.xpath("(//div[contains(text(),'"+cusname+"')])[1]/../div[@class='editButton available']"));
		Actions a=new Actions(driver);
		a.moveToElement(e).click().perform();
		WebElement custwindow=driver.findElement(By.xpath("//div[@class='edit_customer_sliding_panel sliding_panel']"));		
		a.moveToElement(custwindow).perform();
		driver.findElement(By.xpath("(//div[text()='ACTIONS'])[1]")).click();
	
		driver.findElement(By.xpath("//div[text()='Delete']")).click();
	driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
	boolean res = driver.findElement(By.xpath("//*[contains(text(),'has been deleted')]")).isDisplayed();
	
	System.out.println(res);
	//WebElement actions=driver.findElement(By.xpath("(//div[text()='ACTIONS'])[1]"));
				//a.moveToElement(actions).click().perform();
		//WebElement delete=driver.findElement(By.xpath("//div[text()='Delete']"));
		//a.moveToElement(delete).click().perform();
		//WebElement deleteper=driver.findElement(By.xpath("//span[text()='Delete permanently']"));
		//a.moveToElement(deleteper).click().perform();


	}
}