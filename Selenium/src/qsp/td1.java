package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class td1 {


			public static void main(String[] args) throws InterruptedException {
				WebDriver driver = new ChromeDriver();
				driver.get("file:///C:/Users/rushm/Desktop/demo.html");
				Thread.sleep(2000);
				String str = driver.findElement(By.xpath("(//td)[1]")).getText();
					System.out.println(str);
					
				}
				}
						
			


