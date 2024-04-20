package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		driver.switchTo().alert().dismiss();
		String str=driver.findElement(By.xpath("//p[@id='demo']")).getText();
		boolean b =driver.findElement(By.xpath("//p[@id='demo']")).isDisplayed();
		
		
		if(str.equals("You Pressed Cancel") && b==true)
		{
			System.out.println("You Pressed Cancel Text is Displayed");
		
		
	
		
		
		}
		driver.quit();
	}
}
