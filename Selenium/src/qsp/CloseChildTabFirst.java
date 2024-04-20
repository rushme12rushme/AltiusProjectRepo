package qsp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildTabFirst {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.get("http://localhost/login.do");
driver.findElement(By.linkText("actiTIME Inc.")).click();
Set<String> allwh = driver.getWindowHandles();
String pwh=driver.getWindowHandle();
System.out.println("Parent tab "+pwh);
Iterator<String> i =allwh.iterator();
while(i.hasNext())
{
	
	String loopwh = i.next();			
	if(loopwh.equals(pwh))
	{
		System.out.println("Not Closing parent tab");
	}
				
	else
	{
		System.out.println("Closing Child tab");
		System.out.println(loopwh);
		Thread.sleep(2000);
		driver.switchTo().window(loopwh);
		driver.close();
	}
		
}

driver.switchTo().window(pwh);
driver.close();
	}

}
