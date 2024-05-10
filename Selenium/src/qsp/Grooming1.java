package qsp;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grooming1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		List <WebElement> allsugg= driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		ListIterator<WebElement> i=allsugg.listIterator(allsugg.size());
		while(i.hasPrevious())
		{
			WebElement e=i.previous();
			System.out.println(e.getText());
		}
		driver.quit();
	}

}
