package qsp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GroomingInfiniteScroll {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.get("https://demoapps.qspiders.com/ui/scroll/newInfinite?scenario=1");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
	Set<String> allwh = driver.getWindowHandles();
	for(String wh:allwh)
	{
		driver.switchTo().window(wh);
	}
	
	Actions a =new Actions(driver);
	
	for(;;)
	{
	Thread.sleep(2000);
	a.scrollByAmount(0,3000).perform();
	}
}
}
