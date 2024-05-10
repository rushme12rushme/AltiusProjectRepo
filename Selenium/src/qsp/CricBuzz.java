package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricBuzz {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/91551/gt-vs-rcb-45th-match-indian-premier-league-2024");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> batters=driver.findElements(By.xpath("//span[text()='Royal Challengers Bengaluru Innings']/../../div/div[1]/a"));
		List<WebElement> scores = driver.findElements(By.xpath("//span[text()='Royal Challengers Bengaluru Innings']/../../div/div[1]/a/../../div[3]"));

		for(int i=0;i<batters.size();i++)
		{
			
			System.out.print(batters.get(i).getText());
			System.out.print(" has scored ");
			System.out.print(scores.get(i).getText());

			System.out.println();
		}
		
		}
	}
