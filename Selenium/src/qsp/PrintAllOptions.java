package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptions {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 WebElement CountryLB = driver.findElement(By.id("select-multiple-native"));
 Select s = new Select(CountryLB);
 List<WebElement> options = s.getOptions();
 for (int i=0;i<options.size();i++)
 {
	 String op=options.get(i).getText();
	 System.out.println(op);
 }
	}

}
