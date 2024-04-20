package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiColor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		String fsize = driver.findElement(By.className("errormsg")).getCssValue("font-size");
		String ftype = driver.findElement(By.className("errormsg")).getCssValue("font-family");
		System.out.println("font size is"+fsize);
		System.out.println("font type is"+ftype);
		driver.quit();


	}

}
