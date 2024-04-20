package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup1 {

	public static void main(String[] args) {
ChromeOptions o = new ChromeOptions();
o.addArguments("--disable-notifications");
WebDriver driver = new ChromeDriver(o);
driver.get("https://www.easemytrip.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//input[@id='ddate']")).click();
driver.findElement(By.xpath("//span[@id='28/03/2024']")).click();



	}

}
