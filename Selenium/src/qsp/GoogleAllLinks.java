package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAllLinks {

	public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com");
			List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			int LinkCount=allLinks.size();
			for(int i=0;i<LinkCount;i++)
			{
				WebElement link = allLinks.get(i);
				System.out.println(link.getText());
			}
			
	}

}
