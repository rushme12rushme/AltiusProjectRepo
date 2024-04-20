package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.bbc.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.className("close-button")).click();
			WebElement sport = driver.findElement(By.xpath("//h2[text()='Innovation']"));
			Actions s =new Actions(driver);
			s.scrollToElement(sport).perform();
			
	}

}
