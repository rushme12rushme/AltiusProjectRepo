package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentURL {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		Thread.sleep(3000);
		String current = driver.getCurrentUrl();
		System.out.println(current);
		if(current.equals("https://www.selenium.dev/")) {
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
	driver.quit();
		
	}

}
