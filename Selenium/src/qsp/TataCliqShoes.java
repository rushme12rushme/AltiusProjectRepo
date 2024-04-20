package qsp;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TataCliqShoes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.tatacliq.com/");
		driver.findElement(By.id("wzrk-cancel"));
		System.out.print(" Clicked");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//img[@src='//assets.tatacliq.com/medias/sys_master/images/50557264134174.jpg']")).click();
		driver.quit();
		
	}

}
