package qsp;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CloseOnlyParent {
		

			public static void main(String[] args) {
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://secure.indeed.com/");
				driver.findElement(By.id("login-google-button")).click();
				driver.findElement(By.id("apple-signin-button")).click();
				String parentstr=driver.getWindowHandle();
				System.out.println(parentstr);
				Set<String> allHandles = driver.getWindowHandles();	
				for(String handle:allHandles)
				{
					System.out.println(handle.equals(parentstr));
					if(handle.equals(parentstr)==true)
					{
						driver.switchTo().window(handle);
						driver.close();
					}
				}
			}

		

	}


