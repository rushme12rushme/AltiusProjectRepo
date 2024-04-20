package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSourceCode {
	public static void main(String [] args)
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	System.out.println("Title is "+driver.getTitle());
	//System.out.println(driver.getPageSource());
	driver.navigate().to("https://www.google.com/");
	driver.navigate().back();
	driver.quit();
	}

}
