import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToJS {



	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://timesofindia.indiatimes.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 JavascriptExecutor j=(JavascriptExecutor) driver;

		/*
		 * WebElement e = driver.findElement(By.xpath("(//a[text()='Education'])[2]"));
		 * int y= e.getLocation().getY(); System.out.println(y);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * j.executeScript("window.scrollTo(0,"+y+")");
		 */
	long i=(long)(j.executeScript("return  document.body.scrollHeight"));
	System.out.println(i);
}
}	


