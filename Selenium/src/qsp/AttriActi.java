package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttriActi {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
driver.get("https://online.actitime.com/sselenium/login.do");
 String str=driver.findElement(By.id("toPasswordRecoveryPageLink")).getAttribute("href");

System.out.println(str);
		
		}

}
