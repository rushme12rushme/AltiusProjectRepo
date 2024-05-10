package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GroomingFrame {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.automationtesting.in/Frames.html");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement e = driver.findElement(By.name("SingleFrame"));
	driver.switchTo().frame(e);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hi");
	
	driver.switchTo().parentFrame();
	driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
	WebElement e1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	driver.switchTo().frame(e1);
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hi");
	
	}

}
