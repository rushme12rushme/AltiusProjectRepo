package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDOB {

		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts()
			.implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create new account")).click();
		WebElement DayBox =driver.findElement(By.id("day"));
		Select s1 =new Select(DayBox);
		s1.selectByIndex(11);
		
		WebElement MonthBox =driver.findElement(By.id("month"));
		Select s2 =new Select(MonthBox);
		s2.selectByValue("12");
		
		
		WebElement YearBox =driver.findElement(By.id("year"));
		Select s3 =new Select(YearBox);
		s3.selectByVisibleText("1984");
		driver.quit();
	}

}
