package qsp;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GroomingPIB {

	public static void main(String[] args) {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://pib.gov.in/indexd.aspx");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().alert().accept();
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		List <WebElement> links= driver.findElements(By.xpath("//h4[text()='GOI Links']/../ul/li/a"));
		String pwh=driver.getWindowHandle();

		for(int i=0;i<links.size();i++)
		{
			links.get(i).click();
			driver.switchTo().alert().accept();

		}
		Set <String> whs=driver.getWindowHandles();

		for(String w:whs)
		{
			if(pwh.equals(w)==false)
			{
				driver.switchTo().window(w)	;
				System.out.println(driver.getTitle());
				driver.close();

			}
			else
			{
				driver.close();
			}
		}
	}
}







