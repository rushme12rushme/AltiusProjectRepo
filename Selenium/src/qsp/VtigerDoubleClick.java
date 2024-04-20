package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VtigerDoubleClick {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://www.vtiger.com/");
WebElement resources = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
Actions a = new Actions(driver);
a.moveToElement(resources).perform();
driver.findElement(By.xpath("//a[contains(text(),'Customers')]")).click();
WebElement login = driver.findElement(By.id("loginspan"));
a.doubleClick(login).perform();
System.out.println(driver.getTitle());
driver.quit();
	}

}
