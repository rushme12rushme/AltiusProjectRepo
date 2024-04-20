package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingSugg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='cdxNav cdxRightNav']")).click();
		driver.quit();
	}

}
