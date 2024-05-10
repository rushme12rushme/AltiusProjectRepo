import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InfiniteScrollPrac {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/scroll/newInfinite?scenario=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
			Set<String> allwh = driver.getWindowHandles();
			for(String wh:allwh)
			{
				driver.switchTo().window(wh);
			}
			JavascriptExecutor j=(JavascriptExecutor) driver;
			int ht=j.executeScript("return document.body.scrollHeight");
			
	}

}
