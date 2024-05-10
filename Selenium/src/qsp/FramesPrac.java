package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FramesPrac {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//List <WebElement> l=driver.findElement(By.xpath[@cd_frame_id_='ed4539913cbea296f373924ba537d1d0']);
ExpectedConditions.frameToBeAvailableAndSwitchToIt(0);
//driver.switchTo().frame(0);
driver.findElement(By.id("email")).sendKeys("anvvv");
	}

}
