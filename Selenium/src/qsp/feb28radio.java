package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class feb28radio {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//a[.='Create new account']")).click();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

		Thread.sleep(2000);
	int y1 =driver.findElement(By.xpath("(//input[@name='sex'])[1]")).getLocation().getY();
	System.out.println(y1);
	int y2 =driver.findElement(By.xpath("(//input[@name='sex'])[2]")).getLocation().getY();
	System.out.println(y2);
	int y3 =driver.findElement(By.xpath("(//input[@name='sex'])[3]")).getLocation().getY();
	System.out.println(y3);
	driver.quit();
	}
	
	

}
