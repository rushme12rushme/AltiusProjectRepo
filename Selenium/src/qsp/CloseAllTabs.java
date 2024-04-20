package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllTabs {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("http://localhost/login.do");
driver.findElement(By.linkText("actiTIME Inc.")).click();
Set<String> allwh = driver.getWindowHandles();
for(String wh:allwh)
{
	driver.switchTo().window(wh);
	Thread.sleep(4000);
	driver.close();
}
	}

}
