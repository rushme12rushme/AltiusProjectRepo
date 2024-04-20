package qsp;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeAgreement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Help')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'About your actiTIME')]")).click();
		//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(3000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Read License Agreement')]"))).click();
		driver.findElement(By.xpath("//a[contains(text(),'Read License Agreement')]")).click();
		Thread.sleep(2000);
		Set<String> allwh = driver.getWindowHandles();
		String pwh=driver.getWindowHandle();
		List<WebElement> allLinks = null;
		for(String wh:allwh)
		{
			if(pwh.equals(wh)==false)
			{
				driver.switchTo().window(wh);
				allLinks=driver.findElements(By.xpath("//h2"));
			}
		}

		for(WebElement link :allLinks)
		{
			System.out.println(link.getText());
		}

	}

}
