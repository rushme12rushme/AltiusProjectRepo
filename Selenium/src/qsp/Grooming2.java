package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grooming2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("APjFqb")).sendKeys("jobs"+Keys.ENTER);
		List<WebElement> allLinks =  driver.findElements(By.tagName("a"));
		for(int i=0;i<allLinks.size();i++)
		{
			
			String linkText=allLinks.get(i).getText();
			
			System.out.println("Link Text is "+linkText);
			String url=allLinks.get(i).getAttribute("href");
			System.out.println("Link URL is "+url);

		}
		driver.quit();
	}

}
