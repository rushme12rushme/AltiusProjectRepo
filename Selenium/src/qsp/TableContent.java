package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableContent {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/rushm/Desktop/demo.html");
			Thread.sleep(2000);
			List<WebElement> tdata = driver.findElements(By.xpath("(//td)"));
			int count = tdata.size();
			System.out.println("Count of table data is "+count);
			for (int i=0;i<count;i++)
			{
				
				String text=tdata.get(i).getText();
				System.out.println(text);
			}
			
		}
}

				
	


