package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBC {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bbc.com/");
		Thread.sleep(3000);
		List<WebElement> topnews = driver.findElements(By.xpath("//span[@class='top-list-item__bullet']/../h3"));
		int count =topnews.size();
		System.out.println("Latest Business News");
		for(int i=0;i<count;i++)
		{
			String text = topnews.get(i).getText();
			System.out.println(text);
		}
			

		driver.quit();
		
	}

}
