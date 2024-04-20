package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugg {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
Thread.sleep(3000);
driver.findElement(By.id("APjFqb")).sendKeys("qspiders");
Thread.sleep(3000);
List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'qspiders')]"));
int count = allsugg.size();
System.out.println("Count of auto suggestions is "+count);
for (int i=0;i<count;i++)
{
	String text= allsugg.get(i).getText();
	System.out.println(text);
}
allsugg.get(count-1).click();


	}

}
