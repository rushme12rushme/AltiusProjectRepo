package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailCurrentURL {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(3000);
		String current = driver.getCurrentUrl();
		System.out.println(current);
		if(current.equals("https://mail.google.com/mail/u/0/#inbox")) {
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
	driver.quit();
		
	}

}
