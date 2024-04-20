package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiFrames {

	public static void main(String[] args) throws InterruptedException {
 WebDriver driver = new ChromeDriver();
 driver.get("https://testpages.eviltester.com/styled/iframes-test.html");
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 driver.switchTo().frame("theheaderhtml");
	driver.findElement(By.xpath("//a[text()='Index']")).click();
	Thread.sleep(2000);
	driver.quit();
			
	
	}

}
