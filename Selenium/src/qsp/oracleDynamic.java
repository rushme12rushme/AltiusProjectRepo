package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class oracleDynamic {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nseindia.com/");
		driver.findElement(By.xpath("//table/preceding::div[@class='table-container gainers']"));
		//a[text()='GAINERS/LOSERS']/preceding::tr/following::tbody
	}

}
