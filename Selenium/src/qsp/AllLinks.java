package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.myntra.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			List<WebElement> links = driver.findElements(By.tagName("a"));
			int linkcount=links.size();
			for(int i =0;i<linkcount;i++)
			{
				WebElement link = links.get(i);
				System.out.println(link.getText());
				
			}
			driver.quit();
	}

}
