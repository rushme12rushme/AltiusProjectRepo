package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiColor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://scrollmagic.io/examples/advanced/infinite_scrolling.html");
		
		
		JavascriptExecutor j= (JavascriptExecutor) driver;
		 System.out.println(j.executeScript("return document.body.scrollHeight"));
		 Object ht = j.executeScript("return document.body.scrollHeight");

		while(true)
		 {
		 
		 j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		 Thread.sleep(2000);
		 System.out.println(j.executeScript("return document.body.scrollHeight"));

		 Object new_height = j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		 if(ht==new_height)
		 {
			break;
		 }
		 
		 }
		 
		
		}
	}