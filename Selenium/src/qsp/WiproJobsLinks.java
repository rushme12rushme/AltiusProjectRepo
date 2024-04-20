package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproJobsLinks {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.id("APjFqb")).sendKeys("wipro jobs"+Keys.ENTER);
Thread.sleep(2000);
List<WebElement> links = driver.findElements(By.xpath("//cite"));
Thread.sleep(2000);
for(int i = 0;i<links.size();i++)
{
	String link=links.get(i).getText();
	System.out.println(link);
}




	}

}
