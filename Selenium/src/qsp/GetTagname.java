package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagname {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/sselenium/login.do");
		String str1 = driver.findElement(By.id("toPasswordRecoveryPageLink")).getTagName();
		String str2 = driver.findElement(By.id("toPasswordRecoveryPageLink")).getAttribute("href");

		
		System.out.println("tag name is "+str1);
		System.out.println("href value is "+str2);

		driver.quit();
	
	}
}