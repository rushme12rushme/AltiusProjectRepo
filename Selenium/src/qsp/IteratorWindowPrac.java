package qsp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IteratorWindowPrac {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://secure.indeed.com/auth?hl=en_IN&continue=%2Fsettings%2Faccount");
		driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
		driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
		Set <String> allh=driver.getWindowHandles();
		String pwh=driver.getWindowHandle();
		System.out.println("Parent handle "+pwh);
		Iterator<String> i=allh.iterator();
		String s1= i.next();
		System.out.println(s1);
		String s2=i.next();
		driver.switchTo().window(s2);
		System.out.println(" S2 title is  "+driver.getTitle());
		System.out.println(s2);
		String s3=i.next();
		driver.switchTo().window(s3);
		System.out.println(" S3 title is  "+driver.getTitle());

		System.out.println(s3);
		
		
		
	}

}
