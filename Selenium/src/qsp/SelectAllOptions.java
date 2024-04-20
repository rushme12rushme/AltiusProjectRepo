package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllOptions {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 WebElement CountryBox = driver.findElement(By.id("select-multiple-native"));
 Select s = new Select(CountryBox);
List<WebElement> options = s.getOptions();
for(int i=0;i<options.size();i++)
{
	s.selectByIndex(i);
}

for(int i=options.size()-1;i>=0;i--)
{
	s.deselectByIndex(i);
}

	}

}
